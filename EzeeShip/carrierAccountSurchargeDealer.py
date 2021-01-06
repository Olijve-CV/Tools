#-*-coding:utf-8-*-

import xlrd
import os

gdCarrierAccounts = {
    "own-UPS3upsAdd":1,
    "own-UPS5upsAdd":6,
    "own-UPS6upsAdd":16,

    "own-FedEx4fedexAdd":18,
    "own-FedEx5fedexAdd":2,
    "own-FedEx6fedexAdd":17
}

gdService = {
    "-No choice-":0,
    "FedEx Home Delivery®":34
}
# 1.ground 2.express 3.inter 4.all
gdType = { "Express":2, "Ground":1, "Inter":3, "All":4}

sqlTemplate = '''
INSERT INTO public.carrier_account_surcharge (carrier_account_id, surcharge_name, service_id, type, contract_price, user_price, publish_rate, print_code, bill_text, active, create_time, update_time) VALUES 
({accountId}, '{surchargeName}', {serviceId}, {eType}, {contractPrice}, {userPrice}, {publishRate}, '{printCode}', '{billText}', false, '2018-01-01', '{updateTime}');
'''
def genSurchargeHistorySql(file, wfileName, updateTime):
    sourceFile = os.path.join(os.path.curdir , 'resource', 'surcharge', file)
    excelfile = xlrd.open_workbook(sourceFile)
    sheet = excelfile.sheet_by_name("toEdit")
    wf = open(os.path.join(os.path.curdir,'result',wfileName), mode='w', encoding='utf-8')
    for row in range(1, sheet.nrows):
        lValue = sheet.row_values(row)
        account, surchargeName, service, typeName, contractPrice, userPrice, publishRate, printCode,\
                billText, newContractPrice,newUserPrice,newPublishPrice = [str(o).strip() for o in lValue]
        if not account: continue
        print(row, lValue)
        accountId = gdCarrierAccounts[account]
        serviceId = gdService[service]
        eType = gdType[typeName]
        s = sqlTemplate.format(**locals()).strip().replace("\n", " ")
        wf.write(s)
        wf.write("\n")
    wf.close()

genSurchargeHistorySql("ups-surchage-contract 12.28.xlsx", "upsSurchargeHistory.sql", "2020-12-28 00:00:00")
genSurchargeHistorySql("FedEx-surchage contract1.4.xlsx", "fedexSurchargeHistory.sql", "2021-01-04 08:00:00")