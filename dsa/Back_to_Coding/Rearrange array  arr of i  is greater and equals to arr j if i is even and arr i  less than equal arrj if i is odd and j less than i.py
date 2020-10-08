import numpy as np
import array as a

def reArrange(arr, n):
	evenPos = int(n / 2)
	oddPos = n - evenPos
	tempArr = np.empty(n, dtype=object)
	for i in range(0, n):
		tempArr[i] = arr[i]
	tempArr.sort()
	j = oddPos - 1

	for i in range(0, n, 2):
		arr[i] = tempArr[j]
		j -= 1
	j = oddPos

	for i in range(1, n, 2):
		arr[i] = tempArr[j]
		j += 1

	for i in range(0, n):
		print(arr[i], end=" ")


arr = a.array('i', [1, 2, 3, 4, 5, 6, 7])
reArrange(arr, 7)
