inval="123,446,0500.99"

lstr=[]
for i in range(len(inval)):
    if inval[i] ==',':
        lstr.append(' ')
    elif inval[i] =='.':
        lstr.append(',')
    else:
        lstr.append(inval[i])
        
print(''.join(lstr))
