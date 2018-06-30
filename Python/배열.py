input = [[1,5,7,10,103],\
[2,-4,-10,20,542],\
[3,5,67,34,91],\
[-912,-45,98,54,12],\
[12,56,73,4,0]]

def printa(a):
    for i in range(len(a)):
        print()
        for j in range(len(a[0])):
            print("%3i"%a[i][j], end=" ")

# 위의 배열에서 0 이하의 값은 0, 100 이상의 값은 10으로 나눈 값의 나머지로 변경하여 출력하라.             
for row in range(len(input)):
    for col in range(len(input[0])):
        if input[row][col]<=0:
            input[row][col]=0
        elif input[row][col]>=100:
            input[row][col]%=10

printa(input)

# 변경된 배열에서 아래와 같이 2*2 범위 안의 숫자 합을 더했을 때 가장 큰 값을 출력하라. 

res=[[0] * (len(input[0])-1) for _ in range(len(input)-1)]

max = -1
for row in range(len(input)-1):
    for col in range(len(input[0])-1):
        res[row][col]=input[row][col]+input[row+1][col]+input[row][col+1]+input[row+1][col+1]
        if res[row][col] > max:
            max = res[row][col]
print("\n")  

printa(res)

print("\n")

print("max value:",max)


