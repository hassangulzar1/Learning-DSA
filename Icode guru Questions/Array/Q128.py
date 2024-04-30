nums = [100,4,200,1,3,2]
numset = set(nums)

longestLenght = 0
for n in numset:
    if (n -1) not in numset:
        length = 0
        while(n + length)  in numset:
            length += 1
            longestLenght = max(length,longestLenght)



    