def SelectionSort(data) :
	for i in range(0,len(data)) :
		minIdx = i
		
		for j in range (i+1, len(data)) :
			if (data[minIdx] > data[j]) :
				minIdx = j
		
		temp = data[i]
		data[i] = data[minIdx]
		data[minIdx] = temp
		 	

data = [1,2,4,3,5,7,6,8,0,9]

SelectionSort(data)

print (data)	
