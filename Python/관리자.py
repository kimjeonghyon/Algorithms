manage = [('A','Ryu',10),
          ('B','KIM',12),
          ('A','PARK',9),
          ('C','SSO',17),
          ('B','LEE',20),
          ('C','MIN',14),
          ('A','CHOI',8),
          ('B','JEON',15),
          ('C','LIM',19)]

print ("회의실 예약자명 예약시간")

for item in manage:
    print ("%4s  %4s  %4s"%(item[0],item[1],item[2]))
           
print ("예약자명을 인풋값으로 주고, 어느 회의실 몇시에 예약했는 지 출력하시요.")
print ("input : SSO")

input = 'SSO'
for item in manage:
    if item[1] == input:
        print ("회의실 : %2s, 예약시간 :%d\n"%(item[0],item[2]))

print("특정 시간을 인풋값으로 주면 각 회의실들이 예약이 가능한지 불가능한지 출력하시요.")
print("input : 17")

input = 17
office = {}

for item in manage:
    if(item[2] == input):
        office[item[0]]='예약 불가능'
    elif(item[0] not in office):
        office[item[0]] = '예약 가능'
            
list_of_office_status = [(k,v) for k,v in office.items()]
    
from operator import itemgetter
sorted(list_of_office_status,key=itemgetter(0),reverse=False)

for i,j in list_of_office_status:
    print ("%s: %s"%(i,j))


