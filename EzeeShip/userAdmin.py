#-*-coding:utf-8-*-

# id	name	role	email	phone
sss = '''
123	David	admin	479898729@qq.com	86-18684891869
96	Kessie	customerService	kessie@ezeeship.cn	63-9385343444
111	wu_cat@163.com	agentAdmin	wu_cat@163.com	
112	jessie@shipout.cn	agentAdmin	jessie@shipout.cn	
20	nia.huang.2018@gmail.com	agentAdmin	nia.huang.2018@gmail.com	
122	shenqixin	admin	shen.qixin@shipout.cn	86-13787950381
125	celina@ezeeship.com	agentAdmin	celina@ezeeship.com	86-18627919963
93	huanghui	customerService	huang.hui@ezeeship.cn	86-13142171368
104	EzeeShip-HR	customerService	hr@ezeeship.cn	
108	Brian	customerService	Brian@ezeeship.com	86-17324070756
107	yahong	customerService	wang.yahong@shipout.cn	
116	Jason	customerService	jason@shipout.cn	86-18508474110
17	83606690@qq.com	agentAdmin	83606690@qq.com	
18	lesleyhy1109@gmail.com	agentAdmin	lesleyhy1109@gmail.com	
16	emilyzeng113@gmail.com	agentAdmin	emilyzeng113@gmail.com	1-6609981323
117	Cassidy	customerService	cassidy@shipout.cn	
113	Eunice	customerService	eunice@ezeeship.cn	63-9561463830
119	Echo	customerService	zhouqin@ezeeship.cn	86 13510587785
114	ashley@ezeeship.com	agentAdmin	ashley@ezeeship.com	86-15013769369
101	yihaobeauty@gmail.com	agentAdmin	yihaobeauty@gmail.com	13580342935
115	joyce@ezeeship.com	agentAdmin	joyce@ezeeship.com	
121	tanpeijie	admin	tan.peijie@ezeeship.cn	86-15873155550
4	sunye	customerService	sun.ye@ezeeship.cn	18570332616
120	rong	admin	rong.shimeng@ezeeship.cn	86-15080940542
109	chenning	customerService	chen.ning@ezeeship.cn	86-15367110377
124	liulei	admin	liu.lei@ezeeship.cn	86-17603058817
1	esadmin	superAdmin,admin	esadmin	
86	yaqiong	customerService	luo.yaqiong@shipout.cn	86-18873213227
132	bonnie@ezeeship.com	agentAdmin	bonnie@ezeeship.com	86-15274074324
133	niefang	admin	nie.fang@ezeeship.cn	86-13246641346
134	Charlene	customerService	Charlene@ezeeship.cn	86-18674871186
135	eleven@ezeeship.com	agentAdmin	eleven@ezeeship.com	
136	nance@ezeeship.com	agentAdmin	nance@ezeeship.com	86-15973406836
137	Sisi	customerService	sisi@ezeeship.cn	86 15135170489
138	maggie@ezeeship.com	agentAdmin	maggie@ezeeship.com	86 18711045136
139	queena	customerService	Queena@shipout.cn	86-13508413953
140	alice	customerService	alice.welday@shipout.cn	
141	zoey@ezeeship.com	agentAdmin	zoey@ezeeship.com	86-13469087151
40	Ariel	customerService	tao.pei@ezeeship.cn	86-13787049035
142	stella@ezeeship.com	agentAdmin	stella@ezeeship.com	86-18153324599
143	alice@ezeeship.com	agentAdmin	alice@ezeeship.com	
129	Lean	customerService	lean@ezeeship.cn	63-9453881761
144	Faith	customerService	faith@ezeeship.cn	
145	edward@shipout.com	agentAdmin	edward@shipout.com	
146	claire	customerService	claire@shipout.cn	1-8582053053
147	ellen@ezeeship.com	agentAdmin	ellen@ezeeship.com	86-17680166409
84	Yuting	customerService	han.yuting@ezeeship.cn	86-18281548860
130	Ophelia	customerService	Ophelia@ezeeship.cn	1-5172705808
42	Liqi	customerService	zhang.liqi@ezeeship.cn	86-18834695291
102	nevol@ezeeship.com	agentAdmin	nevol@ezeeship.com	188-7332-7777
87	krystal@ezeeship.com	agentAdmin	krystal@ezeeship.com	86-15874094409
23	exship2018@gmail.com	agentAdmin	exship2018@gmail.com	
30	joyce@ezeeship.cn	agentAdmin	joyce@ezeeship.cn	
15	1099726199@qq.com	agentAdmin	1099726199@qq.com	
22	gksrnrvhs@gmail.com	agentAdmin	gksrnrvhs@gmail.com	
21	nn@committeeinc.co	agentAdmin	nn@committeeinc.co	
7	chuckliu	customerService	cheliuxl@gmail.com	1-3107955698
38	Rebecca	customerService	fanxiaoy@gmail.com	1-3108834698
46	yule	admin	yu.le@ezeeship.cn	
53	Rechel	customerService	Rechel@ezeeship.cn	63-9268907004
62	jessie	customerService	hu.xinhuan@ezeeship.cn	86-15581605175
71	Reymund	customerService	reymund@ezeeship.cn	63-9062318221
61	Tyronne	customerService	aa	63-9167976420
80	Roxanne	customerService	abangan.roxanne@gmail.com	63-9324304507
92	jaylen	customerService	jaylen@ezeeship.com	1-8313248949
26	cuiyan	customerService	cui.yan@ezeeship.cn	86-15934175922
70	yanghui	customerService	su.yanghui@ezeeship.cn	86-15584118057
27	dev	admin	wu.diping@ezeeship.cn	86-15018778199
103	Wilson@Ezeeship.com	agentAdmin	Wilson@Ezeeship.com	18773176941
91	shaoqi	customerService	feng.shaoqi@ezeeship.cn	
'''

with open("./result/userAdminPhone.sql", mode="w") as f:
    for ss in sss.split("\n"):
        if(len(ss.strip()) == 0): continue
        id,	name,	role,	email,	phone = ss.split("	")
        print(id,	name,	role,	email,	phone)
        if (len(phone.strip()) == 0): continue
        f.write(f"update user_admin set phone='+{phone}' where id={id}; -- {name}, {email}\n")
