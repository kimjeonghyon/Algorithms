def movingAverage(data,num) :
   ret = []
   for i in range(num-1,len(data)):
      sum = 0
      
      for j in range(0,num) :
         sum += data[i-j]
      
      ret.append(sum/num)
   	  
   return ret



def movingAverage2(data,num) :
    ret = []
    sum = 0

    for i in range(0,num):
        sum += data[i]

    for i in range(num,len(data)) :
        ret.append(sum/num)
        sum = sum + data[i]-data[i-num]

    return ret

   	

data = [2,2,3,4,5,6,7,9,9]

result = movingAverage2(data,3)

print (result)
