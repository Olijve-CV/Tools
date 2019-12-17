import bs4
import json
import re

def getOrderBs():
    with open("./shopify_order.xml") as file:
        bs = bs4.BeautifulSoup(file.read())
    return bs

def GetAllCode(bs):
    lst = []
    for tr in bs.table.tbody.findAll("tr"):
        lst.extend(tr.findAll("code"))
    return [o for o in lst if o.attrs.get("class")==["javascript"]]

def transCode2Dict(lCode):
    dProperty = {}
    for code in lCode:
        js,_ = re.subn(r'\<code class="javascript"\>', "", code.text)
        js,_ = re.subn(r'\<span.*"\>', "", js)
        js,_ = re.subn(r'\<.span\>', "", js)
        js = "{ " + js + "}"
        try:
            dProperty.update(json.loads(js))
        except Exception as e:
            print(e)
            print(js)


    return dProperty

def ParseOrderBs(bs):
    return transCode2Dict(GetAllCode(bs))

def GetOrderProperty():
    bs = getOrderBs()
    return ParseOrderBs(bs)

def Run():
    bs = getOrderBs()
    ParseOrderBs(bs)

if __name__ == "__main__":
    Run()