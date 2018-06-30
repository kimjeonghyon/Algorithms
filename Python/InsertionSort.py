def InsertionSort(data) :
	for i in range(0, len(data)) :
		j = i
		for j in range (j, 0, -1) :
			if data[j] < data[j-1] :
				temp = data[j]
				data[j] = data[j-1]
				data[j-1] = temp
			else :
			  break

data = [1,2,3,5,4,6,8,7,9,0]
InsertionSort(data)
print(data)


