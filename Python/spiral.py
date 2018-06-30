w=5
h=5

x,y =0,0
mat=[[-1]*w for i in range(w)]

num =0

change=0
hMax = h
wMax = w
mode = 0
tx,ty = (0,0)
while(num < h*w):
    normal = True
    
    if x >= hMax or y >= wMax or x <0 or y<0:
    	normal = False
    	
    if normal :
    	if mat[x][y]== -1:
    		mat[x][y] = num
    	else:
    		normal=False
    
    if not normal :
        num-=1
        if mode == 3:
            x+=1
        elif mode ==2:
            y+=1
        elif mode ==1:
            x-=1
        else:
            y-=1
        mode=mode+1
        mode=mode%4
    
    if mode == 3:
        x-=1
    elif mode ==2:
        y-=1
    elif mode ==1:
        x+=1
    else:
        y+=1
        
    num +=1
    
for i in range(h):
    for j in range(w):
        print("%2i"%(mat[i][j]), end= " ")
    print("\n")

    
