# 물품 코드 
# 커피 coffee 우유 milk 즉석밥 rice 물 water 휴지 paper 라면 ramen
codes = {'coffee':'커피','milk':'우유','rice':'즉석밥','water':'물', 'paper':'휴지','ramen':'라면'}

records = ['coeeff','COF%#@$eef','mi  kl','ter%$^wa','MKIL','Mk%@#l$%i','water','WATER']

# 3-1 위의 판매 기록에서 특수문자 빈칸을 제거하고 소문자로 변경하여 출력하라.
# coeeff, cofeef, mikl, terwa, mkil, mkli, water, water

import re
listItem = []
for before_str in records:
    after_str = re.sub("[%|#|@|$|^|' ']", "", before_str)
    listItem.append(after_str.lower())


print ("============Answer 3-1=============")
print (','.join(listItem))


print()

# 3-2 각 판매기록의 정확한 물품코드를 출력하라
# coffee, coffee, milk, water, milk, milk, water, water
codesSorted = {}
for key in codes.keys():
    codesSorted[''.join(sorted(key))]=key
    
print ("============Answer 3-2=============")
listItem2 = []
for item in listItem:
    listItem2.append(codesSorted[''.join(sorted(item))])

print(','.join(listItem2))

# 3-3 이 날에 판매된 물품을 출력하라
# coffee, milk, water
saled = set(listItem2)
print ("============Answer 3-3=============")
print (','.join(sorted(list(saled))))
