#-*-coding:utf-8-*-

import requests
import json
import time
import ssl

_url = "https://fahuolou.com/api/ezeeship/admin/label/list"
header = {"user-agent": "my-app/0.0.1"}
cookie = {"User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36",
          "Cookies": "_fbp=fb.1.1600825283742.974860226; _ga=GA1.2.354458282.1600825293; __zlcmid=10KjSLFOFKllt1u; _gid=GA1.2.1212765545.1602481766; ezeeship=a8488c6d-8dea-428c-bf23-fd6411f01007; _gat_gtag_UA_148418458_1=1"
          }
g_params = {
    "curPageNo":1,
    "pageSize":20
}
def requestTrackingUrl(trackingnumber):
    global g_params
    ssl._create_default_https_context = ssl._create_unverified_context
    g_params["trackingNo"] = trackingnumber.strip()
    r1 = requests.get(_url, params=g_params, headers=header, cookies=cookie, timeout=10, verify=False)      # 带参数的get请求
    # print(r1)
    return r1.json()

def readSrc(path):
    with open(path, mode="r") as f:
        lLines = f.readlines()
        f.close()
        return lLines

dChecked = {}

def checkLines(filename):

    roldfile = open(f"./resource/res_{filename}", "r", encoding="utf-8")
    oldIndx = len(roldfile.readlines())
    roldfile.close()

    writeFile = open(f"./resource/res_{filename}", mode="a+", encoding="utf-8")
    path = f"./resource/{filename}"
    lLines = readSrc(path)
    wLines = writeFile.readlines()
    print("old", len(wLines), oldIndx)
    idx = oldIndx
    for line in lLines[1+oldIndx:]:

        xx = line.split("\t")
        if len(xx) == 1:
            t1, t2, mark = xx[0], "", ""
        elif len(xx) == 2:
            t1, t2, mark = xx[0], xx[1], ""
        else:
            t1, t2, mark = xx[0], xx[1], xx[2]
        print("idx ", idx)
        idx = idx + 1
        if mark != "":
            wLines.append(line)
        else:
            tracking = t1.strip() + t2.strip()
            checkRes = requestTrackingUrl(tracking)
            print(tracking, checkRes)
            if (checkRes.get("datas") == None):
                print("error")
                break
            res = "YES" if len(checkRes.get("datas", []))>0 else "NO"
            if res == "YES":
                # _get = wLines.get
                tData = checkRes.get("datas")[0]
            else:
                tData = ""
            wLine = "\t".join([t1.strip(),t2.strip(),res, str(tData).strip()])
            # wLines.append(wLine)
            writeFile.write(wLine)
            writeFile.write("\n")
            writeFile.flush()
            time.sleep(1)

filename = "fedex-07-24.txt"
checkLines(filename)