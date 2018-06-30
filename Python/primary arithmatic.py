a = 999
b = 999
print (a,b, a+b)
l = []
count = 0
while (a > 0 or b > 0):
    ew = 0
    aa = a%10
    bb = b%10
    a=int(a/10)
    b=int(b/10)
    if (aa+bb+ew)>9:
        count+=1
        ew = 1
    else:
        ew =0
print(count)
