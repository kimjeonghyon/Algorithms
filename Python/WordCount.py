

# 입력된 문자열 : I LOVE LG LG CNS^^
# 검색단어 : LG
# 빈도수 : 2

# 입력된 문자열 : I LOVE LG I LOVE CNS
# 검색단어 : I
# 빈도수 : 2


frequency = {}
input_s = "I LOVE LG I LOVE CNS"
inx=0
count=0

search_word = 'I'

lines = input_s.split(' ')

for line in lines:
    if line == search_word:
        count+=1
        
print("검색단어 %s, count:%i"%(search_word,count))
