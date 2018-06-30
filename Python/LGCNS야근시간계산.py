# 사번, 시작 시, 시작 분, 종료 시, 종료 분, 출장여부
table=[
    [1111,18, 0,19,21,0],
    [2222,18,25,20, 0,1],
    [1111,18,30, 0, 0,1],
    [1111,19,20,21,33,0],
    [3333,18,15,20,15,0],
    [4444,19,15, 0, 0,0],
    [2222,18,15, 0, 0,0]
]

# 출장시 실제 야근 시간에서 1.5를 곱하여 야근 계산을 한다.
# 중복 신청 처리 로직
#  시작 시간은 가장 빠른 시간, 종료 시간은 가장 늦은 시간,
#  출장 여부는 Y, N이 같이 있으면 중 Y로 한다.
#  종료 시간이 0시 0분인 경우, 오류 데이터로 야근 시간 계산 시 제외

print("4-1 위의 야근 데이터를 사번 순으로 내림차순으로 정렬하라.\n")
# (사번이 같은 경우 시작시간이 빠른 기준)
#    [4444,19,15, 0, 0,0],
#    [3333,18,15,20,15,0],
#    [2222,18,15, 0, 0,0]
#    [2222,18,25,20, 0,1],
#    [1111,18, 0,19,21,0],
#    [1111,18,30, 0, 0,1],
#    [1111,19,20,21,33,0],

from operator import itemgetter

s1 = sorted (table, key=itemgetter(2))

s2 = sorted (s1, key=itemgetter(1))

s3 = sorted (s2, key=itemgetter(0), reverse = True)

for i in s3 :
    print (i)
    

    
print( "4-2 총 야근을 한 사원이 몇 명인지 출력하라.\n")
# 3

import copy
s4 = copy.deepcopy(s3)


for i,v in enumerate(s4) :
    if v[3] == 0 and v[4] == 0:
        del s4[i]


ya_empno = set({})
for i  in s4:
    ya_empno.add(i[0])

for i in ya_empno :
    print (i)

print ("4-3 야근을 한 사원의 사번과 야근 시간을 사번 순으로 내림차순으로 출력하라.\n")
# (소수점은 버림)
# 3333 120분
# 2222 142분
# 1111 213분
from itertools import groupby   
g=groupby(s4,key=itemgetter(0))

for i in s4:
    print (i)

for key,val in g:
    start_hour = 23
    start_min = 59
    end_hour = 18
    end_min = 0
    chul = 0
    for item in val:
        if item[1] <= start_hour:
            start_hour = item[1]
        if item[2] <= start_min:
            start_min = item[2]
        if item[3] >= end_hour:
            end_hour = item[3]
        if item[4] >= end_min:
            end_min = item[4]
        if chul + item[5] > 0 :
            chul = 1

    geunmu = end_hour*60+end_min - start_hour*60 - start_min
    if (chul) :
        geunmu = int(geunmu*1.5)
    print (key, geunmu)
