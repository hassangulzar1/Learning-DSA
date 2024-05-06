numbers = [2,7,11,15]
target = 9


s = 0
e = len(numbers) -1

while s < e:
    if numbers[s] + numbers[e] == target:
        print(numbers[s],numbers[e])
        break
    elif numbers[s] + numbers[e] < target:
        s += 1
    else:
        e -= 1