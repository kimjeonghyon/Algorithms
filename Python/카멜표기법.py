inval="calc_max_base_fare"

lstr = []
for i in range(len(inval)):
    if i==0:
        lstr.append(inval[i])
    elif inval[i]=='_' :
        continue
    elif inval[i-1] =='_':
        lstr.append(inval[i].capitalize())
    else:
        lstr.append(inval[i])

print(''.join(lstr))

