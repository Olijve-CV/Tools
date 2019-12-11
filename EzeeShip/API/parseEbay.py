import ebayOrderData

DICT = 1
LIST = 2
ENUM = 3
BOOLEAN = 4
STRING = 5
INT = 6

def checkObjType(obj):
    if isinstance(obj, dict):
        return DICT
    elif isinstance(obj, list):
        return LIST
    elif isinstance(obj, str):
        if " : [" in obj:
            return ENUM
        elif "boolean" == obj:
            return BOOLEAN
        elif "integer" == obj:
            return INT
        elif "string" == obj or "" == obj:
            return STRING
    raise Exception("None Type of obj: " + str(obj))

gdTypeObj = {}
gdConst = set()

class DataObj(object):

    attr_template = """
    @JsonProperty(value = JsonConstants.%s)%s
    val %s: %s? = null"""
    
    def __init__(self, name="", obj=None):
        self.name = name
        self.obj = obj
        self.attributes = {}
        RegisterConstName(name)
    
    def put(self, k, v):
        self.attributes[k] = v
        RegisterConstName(k)
        
    def getUpperVaribale(self):
        return self.name.upper()
        
    def getExtraAnnotation(self):
        return ""
        
    def getVariableName(self):
        
        return self.name
        
    def getVariableType(self):
        pass
        
    def getCode(self):
        return self.attr_template % (self.getUpperVaribale(), self.getExtraAnnotation(),
                    self.getVariableName(), self.getVariableType())
    
        
class IntObj(DataObj):

    def getVariableType(self):
        return "Int"
    
class StringObj(DataObj):
    def getVariableType(self):
        if self.name.endswith("Date"):
            return "Date"
        elif self.name in ("value", ):
            return "BigDecimal"
        else:
            return "String"
           
    def getExtraAnnotation(self):
        if self.name.endswith("Date"):
            return """
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)"""
        else:
            return ""

class EnumObj(DataObj):
    def getVariableType(self):
        return "String"
    
class BoolObj(DataObj):
    def getVariableType(self):
        return "Boolean"

class DictObj(DataObj):
    def GetClassName(self):
        return self.name[0].upper() + self.name[1:]

    def decodeToKotlinObj(self):
        str = """
@Data
class %s {
 
    %s
    
}
        """%(self.GetClassName(), self.GetAttributeCode())
        return str
        
    def getVariableType(self):
        return self.name[0].upper() + self.name[1:]
        
    def GetAttributeCode(self):
        attrlst = [obj.getCode() for _, obj in self.attributes.items()]
        
        return "\n    ".join(attrlst)
    
class ListObj(DataObj):
    def setChildObj(self, obj):
        self.ChildObj = obj
    def getVariableType(self):
        return "List<%s>" % (self.ChildObj.getVariableType())
        
    def getUpperVaribale(self):
        return self.originName.upper()
        
    def getVariableName(self):
        
        return self.name + "List"
 
def TryRenameObj(dictObj):

    global gdTypeObj
    name = dictObj.name
    while True:
        if name in gdTypeObj and set(dictObj.attributes.keys()) != set(gdTypeObj[name].attributes.keys()):
            if name[-1].isdigit():
                name = name[:-1] + str(int(name[-1]) + 1)
            else:
                name = name + "_1"
            dictObj.name = name
        else:
            break
            
def RegisterConstName(name):
    global gdConst
    gdConst.add(name)
            
def parseData(name, obj):

    iType = checkObjType(obj)
    
    if iType == DICT:
        dictObj = DictObj(name, obj)

        for k,v in obj.items():
            res = parseData(k, v)
            dictObj.put(res.name, res)

        TryRenameObj(dictObj)
        gdTypeObj[dictObj.name] = dictObj
        return dictObj
    elif iType == LIST:
        if name.endswith("es"):
            _name = name[:-2]
        elif name.endswith("s"):
            _name = name[:-1]
        else:
            _name = name
        listObj = ListObj(_name, obj)
        listObj.originName = name
        RegisterConstName(name)
        newObj = parseData(_name, obj[0])
        listObj.setChildObj(newObj)
        return listObj
    elif iType == INT:
        return IntObj(name, obj)
    elif iType == BOOLEAN:
        return BoolObj(name, obj)
    elif iType == STRING:
        return StringObj(name, obj)
    elif iType == ENUM:
        return EnumObj(name, obj)
    else:
        raise Exception("iType lost: %s"%iType)

relative_path = "./EbayModel/"
def generateCodeFileByObj(obj):

    name = obj.name
    writeFile = open("%s%s.kt"%(relative_path, name[0].upper() + name[1:]), "w")
    # 文件头
    writeFile.writelines('''package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date
''')
    writeFile.writelines(obj.decodeToKotlinObj())
    writeFile.close()
    
def GetConstText():
    global gdConst
    constLst = ['const val %s = "%s"'%(obj.upper(), obj) for obj in gdConst]
    return "\r\n\t".join(constLst)

def generateConstFile():
    jsonFile = open("%s%s.kt"%(relative_path, "JsonConstants"), "w")
    jsonFile.writelines("""package com.apex.ebay.model

object JsonConstants {

    %s
    
}"""%GetConstText())
    jsonFile.close()
    
    
parseData("OrderList", ebayOrderData.OrderList)
for name, obj in gdTypeObj.items():
    generateCodeFileByObj(obj)

generateConstFile()