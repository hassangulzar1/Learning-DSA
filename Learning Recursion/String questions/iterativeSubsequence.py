def subset(arr):
    outer = [[]]
    for num in arr:
        n = len(outer)
        for i in range(n):
            internal = list(outer[i])
            internal.append(num)
            outer.append(internal)
    return outer

arr = [1,2,3]
ans = subset(arr)

for i in ans:
    print(i)

