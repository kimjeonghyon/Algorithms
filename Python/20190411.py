# 1. 검색어 필터링
wordlist = ['korea','1korea','worldcup','worl2d','Worldcup','WorldCup','movie','KOREA']
# 1) 유효한 검색어 추출 (숫자가 포함되지 않은 검색어)
import re
validWordList = [word for word in wordlist if len(re.findall('\d+',word)) == 0]

# 2) 검색어 대문자 변환
validWordList2 = [word.upper() for word in validWordList]

# 3) 최빈 검색어 추출
from collections import Counter
counts = Counter(validWordList2)
counts.most_common(2)

# 2. 체크수 구하기
# inputData = 37817
# 1) check Num 구하기
inputData = 98794
numData = [ i for i in str(inputData)]
locData = [ str(i) for i in range(len(numData),0,-1)]
sumNum = 0
for x, y in zip (numData, locData):
  sumNum += int(x)*int(y)

chkNum = sumNum % len(numData)
if chkNum == 0 : 
    chkNum = sumNum // len(numData)
chkNum

# 2) 체크수를 원래수에 연결하기
chklen = len(str(chkNum))
if chklen == 1:
  newnum = str(inputData)+str(chkNum)
if chklen == 2:
  a = int(str(chkNum)[0])  
  b = int(str(chkNum)[1])  
  newnum = str(max(a,b)) + str(inputData) + str(min(a,b))

newnum

# 3. 나누기
inputData = 235283
# inputData = 3402822
# 1) 0 -> 1로 치환 한다. 
strInput = str(inputData)
strInput = strInput.replace('0','1')
strInput
# 2) 숫자를 두자리씩 끊어 연산을 수행하여 결과 저장
result = []
for i in range(len(strInput)-1):
  a = strInput[i]
  b = strInput[i+1]
  print (i, int(a+b))
  if a < b :
    result.append(str(int(a)%int(b)))
  else : 
    result.append(str(int(a)//int(b)))

result = ''.join(result)
# 3) 중복되는 수 제거 (앞에 수를 남긴다.)
result
tmpData = ""
for i in result:
    if tmpData.find(i) == -1:
        tmpData += i
tmpData


# 4. 이름 정리
# 1) 이름을 권자되는 영문 표기로 변환
changedList = []
for name in ['kim yu na','Ban Ki moon','Ha Kyoung Min','Kim Yu Na']:
    splitName = name.split(" ")
    name=splitName[0].capitalize()+" "+splitName[1].capitalize()+splitName[2].lower()
    changedList.append(name)
changedList

# 2) 중복 제거
removedList = []
for data in changedList:
    if data not in removedList:
        removedList.append(data)
removedList

# 3) 동일 성씨 수 구하기
numberOfSameName = 0
for temp in removedList:
    if (temp.split(" ")[0] == name):
        numberOfSameName += 1
numberOfSameName