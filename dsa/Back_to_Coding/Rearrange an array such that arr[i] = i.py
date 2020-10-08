def fix(a, len):
	for i in range(0, len):
		if a[i] != -1 and a[i] != i:
			x = a[i]
			while a[x] != -1 and a[x] != x:
				y = a[x]
				a[x] = x
				x = y
			a[x] = x
			if a[i] != i:
				a[i] = -1


a = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
fix(a, len(a))

for i in range(0, len(a)):
	print(a[i], end=" ")

#Time Complexity: O(n)
