#-*-coding:utf-8-*

import pandas
import time
import xlwt

gUserLabel = {

}

posFileName = {
    1: "<=500",
    2: "<=1000",
    3: "<=2500",
    4: "<=5000",
    5: "<=10000",
    6: "10000+"
}

class UserLabelInfo:
    def __init__(self, email):
        self.email = email
        self.labelCnt = 0
        self.labelAmount = 0
        self.labelInfoByAddr = {}

        self.labelInfoByAddrSort = []
        self.amountPos = 0

    def addOneRow(self, id, senderAddressId, senderAddressLine1, senderZipCode, billAmount, rate):
        self.labelCnt += 1
        iAddRate = billAmount if billAmount>0 else rate
        if (iAddRate<=0):
            raise (f"addOneRowError: {id}, {billAmount}, {rate}")
        self.labelAmount += iAddRate
        tSender = (senderAddressLine1, senderZipCode)
        if tSender in self.labelInfoByAddr:
            self.labelInfoByAddr[tSender] += 1
        else:
            self.labelInfoByAddr[tSender] = 1

    def analysis(self):
        '''
        确定区间
            0-500 ->1
            500-1000 ->2
            1000-2500 ->3
            2500-5000 ->4
            5000-10000 ->5
            10000+ ->6
        '''
        amount = self.labelAmount
        if amount<=500:
            self.amountPos = 1
        elif 500<amount<=1000:
            self.amountPos = 2
        elif 1000<amount<=2500:
            self.amountPos = 3
        elif 2500<amount<=5000:
            self.amountPos=4
        elif 5000<amount<=10000:
            self.amountPos=5
        else:
            self.amountPos=6

         #按照地址排序并计算比例
        self.labelInfoByAddrSort = [(j*100/self.labelCnt,i) for (i, j) in self.labelInfoByAddr.items()]
        self.labelInfoByAddrSort.sort(key=lambda a:a[0], reverse=True)

    def showAnalysisReport(self):
        return f"{self.email},{self.amountPos},{self.labelAmount}, {self.labelCnt}, {len(self.labelInfoByAddrSort)}, {self.labelInfoByAddrSort[0][0]}, {self.labelInfoByAddrSort[0][1]}"

def parseUserLabelInfo():
    pCsv = pandas.read_csv("./SourceData/select_ui_email_orders_id_orders_sender_.csv")
    for row in pCsv.iterrows():
        email, orderId, senderAddressId, senderAddressLine1, senderZipCode, olId, billAmount, rate = row[1].values
        if (email not in gUserLabel):
            gUserLabel[email] = UserLabelInfo(email)
        userLabelInfo = gUserLabel[email]
        userLabelInfo.addOneRow(row[0], senderAddressId, senderAddressLine1, senderZipCode, billAmount, rate)

    generateExcelReport()

def addOneRowRecord(workSheetRowRecord, filename):
    workSheetRowRecord[filename] = workSheetRowRecord.get(filename,0) +1

def generateExcelReport():
    workbook = xlwt.Workbook(encoding = 'utf-8')
    workSheetRowRecord = {}
    for filename in posFileName.values():
        workSheet = workbook.add_sheet(filename)
        print(workSheet)
        idx = 0
        for column in "email,labelAmount,labelCnt,senderAddrCnt,firstAddrRatio,firstAddress".split(","):
            workSheet.write(0, idx, column)
            idx += 1
        addOneRowRecord(workSheetRowRecord, filename)


    for userLabelInfo in gUserLabel.values():
        userLabelInfo.analysis()
        filename = posFileName[userLabelInfo.amountPos]
        workSheet = workbook.get_sheet(filename)
        rowIdx = workSheetRowRecord[filename]
        workSheet.write(rowIdx, 0, userLabelInfo.email)
        workSheet.write(rowIdx, 1, userLabelInfo.labelAmount)
        workSheet.write(rowIdx, 2, userLabelInfo.labelCnt)
        workSheet.write(rowIdx, 3, len(userLabelInfo.labelInfoByAddrSort))
        print(userLabelInfo.labelInfoByAddrSort)
        workSheet.write(rowIdx, 4, userLabelInfo.labelInfoByAddrSort[0][0])
        workSheet.write(rowIdx, 5, str(userLabelInfo.labelInfoByAddrSort[0][1]))
        addOneRowRecord(workSheetRowRecord,workSheet.get_name())

    workbook.save("./Report/userLableAnalysis.xls")


if __name__ == '__main__':
    starttime = time.time()
    parseUserLabelInfo()
    for userLabelInfo in gUserLabel.values():
        print(userLabelInfo.showAnalysisReport())
    costtime = time.time() - starttime
    print(f"costtime: {costtime}")

