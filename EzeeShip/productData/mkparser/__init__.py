#-*-coding:utf-8-*-

import xlrd
import os
import Templates

# 临时写法
def mkLabelAndRateMsg(path):
    sourceFile = os.path.join(path, 'Data','Source', 'LabelAndRateMsg.xlsx')
    print(path, sourceFile)
    excelfile = xlrd.open_workbook(sourceFile)
    wf = open(os.path.join(path,'Data','Yml','LabelAndRateMsg.yml'), mode='w')
    module = "pdfunc"
    labelCvts = mkCvts(excelfile.sheet_by_name("LabelMsgConverter"))
    getRateCvts = mkCvts(excelfile.sheet_by_name("EstimateMsgConverter"))
    wf.write(Templates.LabelAdnRateMsg.gsTemplate.format(**locals()).strip())
    wf.close()

def mkCvts(sheet):
    return "test2"


