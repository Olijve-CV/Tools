#-*-coding:utf-8-*-

import requests
import json
import time

_url = "http://fahuolou.com/api/ezeeship/adminPostage/list"
header = {"user-agent": "my-app/0.0.1"}
cookie = {"User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36",
          "Cookies": "_ga=GA1.1.443939740.1593402303; _gid=GA1.1.1760325882.1593402303; __zlcmid=ywjFGzgJlCorPc; ezeeship=f3b68bbb-4a5b-4a46-bd32-fb63c9331d3c"
          }
g_params = {
    "curPageNo":1,
    "pageSize":20,
    "status":1
}
def requestTrackingUrl(trackingnumber):
    global g_params
    g_params["trackingNumber"] = trackingnumber.strip()
    r1 = requests.get(_url, params=g_params, headers=header, cookies=cookie, timeout=10)      # 带参数的get请求
    # print(r1)
    return r1.json()

def readSrc(path):
    with open(path, mode="r") as f:
        lLines = f.readlines()
        f.close()
        return lLines

dChecked = {}

def checkLines(filename):
    try:
        roldfile = open(f"./resource/res_{filename}", "r")
        oldIndx = len(roldfile.readlines())
        roldfile.close()
    except:
        oldIndx = 0
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

filename = "fedex-eda-0706.txt"
checkLines(filename)