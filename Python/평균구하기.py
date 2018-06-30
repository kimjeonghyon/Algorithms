# 부서마다 연구 과제를 할당함.
# 과제 건수가 주어 졌을 때, 과제가 분배되는 모든 경우의 수 출력
# 입력값 : 과제 수
# 출력값 :
# case 1) 부서수_과제수
# case 2) 부서수_과제수
# 입력 10
# 출력
# 10_1
# 5_2
# 2_5
# 1_10
input = 10
deptList = []
case={}
for i in range(1,input+1):
    if input%i==0:
       print ("%i_%i"%(10//i,i))
       deptList.append(i)
       case[10//i]=i

# 부서 평균값과 부서 평균값에 가장 근접한 case를 출력하시요.
# 부서 평균값과 근접한 case가 1개 이상일 경우, 부서 수가 더 많은 것을 출력한다.
# 입력 : 10
# 출력 :
# 평균값 : 4
# 평균에 근접한 case : 5_2
mean = int(sum(deptList)/float(len(deptList)))

print ("평균값:",mean)

deptList.sort()

print ("dept list", deptList)

idx=0
for idx in range(len(deptList)):
    gap = deptList[idx] - mean
    if  gap > 0 :
        break;

gap1 = deptList[idx]-mean
gap2 = mean-deptList[idx]
nearIdx = idx
if gap1 < gap2:
    if idx > 0 :
        nearIdx = idx-1
        
print ("평균에 근접한 case :%i_%i"%(deptList[nearIdx],case[deptList[nearIdx]]))

