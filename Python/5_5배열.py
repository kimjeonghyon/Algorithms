
b1 = [[1,5,7,10,103],
          [2,-4,-10,20,542],
          [3,5,67,34,91],
          [-912,-45,98,54,12],
          [12,56,73,4,0]]

#문제 1-1
# 위의 배열에서 0 이하의 값은 0, 100 이상의 값은 10으로 나눈 값의 나머지로 변경하여 출력하라.

b2 = [[0 for i in range(len(b1[0]))] for j in range(len(b1))]



for i in range(len(b1)):
    for j in range(len(b1[0])):
        if b1[i][j] >=100 :
            b2[i][j] = b1[i][j]%10
        elif b1[i][j] >0:
            b2[i][j] = b1[i][j]

for i in b2:
    print(i)       


#문제 1-2
# 변경된 배열에서 아래와 같이 2*2 범위 안의 숫자 합을 더했을 때 가장 큰 값을 출력하라.

mval = 0
for i in range(len(b2)-1):
    for j in range(len(b2[0])-1):
        s = b2[i][j]+b2[i+1][j]+b2[i][j+1]+b2[i+1][j+1]
        if mval < s:
            mval = s

print (mval)
