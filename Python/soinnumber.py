def getSoinNumber (num) :
	ret = []
	for i in range(2,num+1) :
		if num == 1 : break
		while 1 :
			if num % i == 0 :
				ret.append(i) 
				num = num / i
			else :
				break
	return ret
	
	
result = getSoinNumber(8)

print (result)
