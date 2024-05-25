nums = [-1,0,3,5,9,12]
target = 9

s = 0
e = len(nums) - 1

ans = -1

while s < e:
    mid = (s + e) // 2

    if nums[mid] == target:
        ans = mid
    elif nums[mid] < target:
        s = mid + 1
    else:
        e = mid - 1
