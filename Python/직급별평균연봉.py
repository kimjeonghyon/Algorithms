
salary = {'23561':5600, '37123':4100, '33777':4400, \
          '13451':6300, '23579':5900, '87594':2400, \
          '59545':3500, '49376':3600 }

employee = {'59545': ('나연','대리'), '37123':('정연','대리'), \
            '23561': ('모모','과장'), '33777':('사나','과장'), \
            '23579': ('지효','차장'), '87594':('미나','사원'), \
            '13451': ('다현','부장'), '49376':('채영','대리')}


# 직급별 평균 연봉
# 1. 직급 평균연봉으로 구성된 직급별 평균 연봉 정보를 출력하시요.
# 출력 순서는 평균연봉의 오름차순이다.
# 평균연봉은 만원 단위에서 반올림하여 처리한다.
# 대리 평균 연봉
# (3500 + 3600 + 4100) / 3
# 출력
# 직급 평균연봉 (만원)
# 사원, 2400
# 대리, 3733
# 과장, 5000
# 차장, 5900
# 부장, 6300

# 사번, 직급 목록
t1 = []
for k,v in employee.items():
    t1.append((v[1],salary[k]))

from operator import itemgetter   
from itertools import groupby   

t1.sort(key=itemgetter(0))
g=groupby(t1,key=itemgetter(0))

t2 = []
for key,val in g:
    sum = 0
    count = 0
    for i,j in val:
        sum +=j
        count +=1
    t2.append((key,round(sum/float(count))))


t3 = sorted(t2, key=lambda i: i[1])


for i in t3:
    print (i)
