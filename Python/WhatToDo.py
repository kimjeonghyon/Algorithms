import random
import datetime

now_list = ['TCT(SSP,C#)(7/20)',\
            'ADP 실기(10/27)' ]

future_list = ['Top10 app 만들기', '경매입찰(10월)', 'kaggle','빅데이터공모전','코딩도장','코드몬스터','저축','블록체인 기술 익히기', 'Miscellaneous']

now = datetime.datetime.now().hour

what = ""

if now < 12 :
    what = 'NOW'
    l = random.choice(now_list)
else :
    what = 'FUTURE'
    l = random.choice(future_list)

print ("It's time for", what)
print (l+"를 즐기세요. 화이팅!! ^^")
