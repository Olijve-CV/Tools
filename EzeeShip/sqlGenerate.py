#-*-coding:utf-8-*-

sUserInfo = """
"""
def genInsert(str):
    id, email, orgId, status, userCode, createTime = str.split(",")
    return """insert into userInfo (id, email, orgId, status, userCode, createTime) value ({id}, "{email}", {orgId}, {status}, "{userCode}", "{createTime}");""".format(**locals())

def genUpdate(str):
    id, email, orgId, status, userCode, createTime = str.split(",")
    return """update userInfo set userCode="{userCode}" where id = {id};""".format(**locals())

lInsert = []
lUpdate = []
for userInfo in sUserInfo.split("\n"):
    if (len(userInfo.strip()) == 0):
        continue
    lInsert.append(genInsert(userInfo))
    lUpdate.append(genUpdate(userInfo))

# with open("Insert.sql", mode="w") as f:
#     f.write("\n".join(lInsert))
#
# with open("Update.sql", mode="w") as f:
#     f.write("\n".join(lUpdate))

frozenEmails = """
chinaangela110@gmail.com
chao7186660805@qq.com
jmc22392@gmail.com
bieshihuan@outlook.com
yseiga77@gmail.com
mybabyjessie@gmail.com
505244951@qq.com
552301533@qq.com
jessica123057@yahoo.com
isabella6191@gmail.com
kellysin0204@yahoo.com
yuanmei509@gmail.com
zhuyin020403@gmail.com
Judy.qian77@gmail.com
jingjingren88@gmail.com
online@sungwonprinting.com
echo840820@gmail.com
wowohuali@gmail.com
baojiajia569@gmail.com
billionventureinternational@gmail.com
aplusgraphicny@gmail.com
qiangsun@yahoo.com
jeanne.yin@gmail.com
sunday0819p@gmail.com
b3nny0917@gmail.com
fangvip2020@outlook.com
supernovazhen@hotmail.com
calpolyliuan@gmail.com
1977915965@QQ.COM
Annie9172144961@gmail.com
support@divineresemblance.com
tiffany.jiang@qq.com
lauralu314@gmail.com
nikoloveu@icloud.com
kufizz@gmail.com
caitlin5420@icloud.com
amyliu94@163.com
jin.hao@hotmail.com
790783781@qq.com
liz.world07@gmail.com
hanswuprogrammer@gmail.com
a2051287120@gmail.com
susan.chia479@gmail.com
Johnnyggggggggg@gmail.com
jessica-time@hotmail.com
bin.zhao101@gmail.com
yansyang43@gmail.com
quentin0904@gmail.com
fantianle2013@gmail.com
monalisir@gmail.com
2735085863@qq.com
cjlin826@gmail.com
1532289691@qq.com
kikik8893@gmail.com
firegunben@gmail.com
wuxijay@me.com
theclowntysky@hotmail.com
736483266@qq.com
marc2012g@gmail.com
sales@sgooky.net
xiaoxiu_dou@hotmail.com
hfjiansong@gmail.com
1908143299@qq.com
info@usfanli.com
280633183@qq.com
mike@bigplush.com
guolinli@gmail.com
nia@ezeeship.cn
lhonghuan@gmail.com
xuroger12@outlook.com
Zujihang@yahoo.com
chenpengba1@gmail.com
californiaartint@gmail.com
windelfqian@gmail.com
"""

def genUpdateFrozen(str):
    email = str.strip()
    if len(email) == 0:
        return email
    return """update user_info set status=3 where email='{email}';""".format(**locals())
with open("updateFrozen.sql", mode="w") as f:
    for userInfo in frozenEmails.split("\n"):
        f.write(genUpdateFrozen(userInfo))
        f.write("\n")

closeServiceEmails = """
kyshipping.chi@gmail.com
andychiou86@qq.com
lin6261198@gmail.com
rongwang123@hotmail.com
eapcusa.service@gmail.com
ohyi61377@naver.com
nine9inspiration@gmail.com
zosyqy@gmail.com
zonghuiouyang@gmail.com
sylvia_yuas@163.com
ted@advantabuy.com
thesbusinessus@gmail.com
jonibill123@gmail.com
juan6267319398@gmail.com
mhcc@huayiofamerica.com
2334358295@qq.com
124712444@qq.com
archie.w.lee@gmail.com
mataishan85@gmail.com
ivioksha@live.com
562191778@qq.com
lanyinerhoo@gmail.com
contact@reynarose.com
lirachel180@gmail.com
979963287@qq.com
8990679@qq.com
397653307@qq.com
chloezq0404@gmail.com
xie.family.16@gmail.com
gft.fllc@gmail.com
gm0928@163.com
365584962@qq.com
jenny@tomtoc.cn
790863645@qq.com
66681841@QQ.COM
jason@ecloudexpressusa.com
Fiona33168@gmail.com
winssyllc@gmail.com
KilaCart@gmail.com
maopiqiu@gmail.com
qwe588@yahoo.com
ericada1986@gmail.com
maxlinkincca@gmail.com
hollyplakos@gmail.com
961096572@qq.com
1415824728@qq.com
Ysz7617420@gmail.com
bleucubellc@gmail.com
tingtinghe07@yahoo.com
usayinghe@yingheinc.com
lyjfigo@gmail.com
chendongxiong500@gmail.com
annaanna28ma@gmail.com
Lofortoby@foxmail.com
jaychloe1@yahoo.com
36922144@qq.com
snowy567@gmail.com
021hm@163.com
pictoriuhl@gmail.com
chiuyichinese@gmail.com
huizhonghuang@hotmail.com
tinalksm@yahoo.com
453340958@qq.com
huilin.yang@dot.ca.gov
kpbizinc@gmail.com
ipounited@gmail.com
info@ydpusa.com
eqian88@yahoo.com
nstartsmart@gmail.com
elynnling66@gmail.com
1340062069@qq.com
mojuice00@gmail.com
nsx2envy@gmail.com
thecaregadget.01@gmail.com
amazon@jeway.net
irenex33@yahoo.com
fangbingchen7456@gmail.com
arya923qy@gmail.com
tilanyinc@gmail.com
sxh707298@126.com
1297263952@qq.com
qingye225@gmail.com
oneoneting@gmail.com
emilyraymond1314@gmail.com
2032173760@qq.com
474753358@qq.com
sfahaad@gmail.com
sarah_lee_usa@yahoo.com
shawnyangysr@gmail.com
greatkoei@hotmail.com
andy.qi1989@gmail.com
kcahtehny@hotmail.com
kinhei333@yahoo.com
ustechdeal@gmail.com
852293311@qq.com
jhuang4998@gmail.com
trendybuyonline@gmail.com
angelaho0504@gmail.com
salesint@calimetco.com
jacoblee600@yahoo.com
greenboatled@gmail.com
bestdallc@gmail.com
lvrong1999@gmail.com
patricia_langrehr@yahoo.com
Qiaoxinnn@gmail.com
huangyan8601@gmail.com
2591985162@qq.com
norman@fcmtfashion.com
ben.bishop@hotmail.com
xiqu1993@hotmail.com
linda236673@gmail.com
honestar.cl@gmail.com
277161754@qq.com
buymicome@gmail.com
chenx6168@gmail.com
xiujiangzhao@126.com
Rongxian33@gmail.com
colorelfstore@gmail.com
chenyang00505@gmail.com
ecworldtrading@yahoo.com
76001456@qq.com
cooglele2016@gmail.com
yintai168@gmail.com
foodycorp1@gmail.com
cathyycpa@gmail.com
joysophie810@hotmail.com
leekousa@gmail.com
erickbao@gmail.com
xj@noviland.com
benchen618@yahoo.com
frank.bin.liu@gmail.com
jmrincon@esmar.co
williamge318@hotmail.com
newyork@bzara.com
ayohahomegarden@gmail.com
diana.wang@ustoshop.com
ne2wcell@gmail.com
mike@megafurnishing.com
info@xinchigroup.com
bonnieandbone@gmail.com
xbenfeng@gmail.com
qiyichenx@gmail.com
jiangling170@gmail.com
HJSTAR2015@GMAIL.COM
minijoice.mitbbs@gmail.com
zyygroup@gmail.com
supply@opolar.com
springpc@gmail.com
theultracomputer@hotmail.com
henry20080828@gmail.com
beautyproductworld@gmail.com
sidney.xiao@gmail.com
myxsophia@gmail.com
smile1109b@yahoo.com.tw
754959542@qq.com
1845125899@qq.com
andrewragnell@gmail.com
jkprintinginc@gmail.com
hybzt@seinstant.com
chh-sales@outlook.com
weiminliu.rx@gmail.com
tnb14255@gmail.com
xichen1718@gmail.com
Lili12341968@gmail.com
fwang57@gmail.com
mpdesign.prints@gmail.com
greenorcapack@gmail.com
umtech.amazon@gmail.com
dennychenus@gmail.com
chunshi.mitbbs@gmail.com
15819583@qq.com
p51668mitbbs@gmail.com
sailina0527@gmail.com
fei@wftradingllc.com
timetoworking@gmail.com
somewhatmit@gmail.com
mwang52810@yahoo.com
dongzhifei2389@gmail.com
ocpostalcenternet@gmail.com
sales@incrediblerc.com
ewinindustrial@gmail.com
sales@winghydro.com
"""

def genCloseEmails(str):
    email = str.strip()
    if len(email) == 0:
        return email
    return """update user_service_setting set carrier_service_ids=Array[1,2,3,4,5,6,7,8] where exists (select 1 from user_info where user_info.id=user_service_setting.user_id and user_info.email='{email}') ;""".format(**locals())
glEmails = []
with open("closeSevice.sql", mode="w") as f:
    for userInfo in closeServiceEmails.split("\n"):
        if userInfo.strip():
            glEmails.append("'%s'"%userInfo)
        f.write(genCloseEmails(userInfo))
        f.write("\n")
print(",".join(glEmails))

levelEmails="""
ABDIAZIZ.OSMAN36@GMAIL.COM
lu290967715@gmail.com
yizhouusa@hotmail.com
yanfanglin27@gmail.com
mia201705@yahoo.com
huajiangwvu@gmail.com
649537710@qq.com
saratogallc@gmail.com
"""
def genCloseEmails(str):
    email = str.strip()
    if len(email) == 0:
        return email
    return """update """.format(**locals())
with open("levelChange.sql", mode="w") as f:
    for userInfo in levelEmails.split("\n"):
        f.write(genCloseEmails(userInfo))
        f.write("\n")


