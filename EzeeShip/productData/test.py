#-*-coding:utf-8-*-

import xlrd
path = './Data/Source/LabelAndRateMsq.xlsx'
excelfile = xlrd.open_workbook(path)
print(excelfile.sheet_names())

import csv
wf = open('/Data/test.txt', mode='w')
with open('./Data/Source/LabelAndRateMsq.csv') as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)
        wf.write("\t".join(row))
        wf.write("\n")
wf.flush()
wf.close()