file = open("rent.txt",'r')
lines = file.read().split('\n')

vehcles = {}

for line in lines:
    if len(line) < 1:
        continue
        
    l = line.split(' ')
    if (l[0] in vehcles):
        if (l[1]=='S'):
            vehcles[l[0]] = [l[2],vehcles[l[0]][1]]
        else:
            vehcles[l[0]] = [vehcles[l[0]][0],l[2]]
    
    else:
        if (l[1]=='S'):
            vehcles[l[0]] = [l[2],'20170701000000']
        else:
            vehcles[l[0]] = ['20170601000000',l[2]]
            
file.close()

print(vehcles)
