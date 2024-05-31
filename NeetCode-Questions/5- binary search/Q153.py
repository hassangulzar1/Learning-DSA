nums = [11,13,15,17]


# if nums[0] < nums[len(nums) -1] or len(nums) == 1:
#             return nums[0]
def findPivot(numsArr):
    s = 0
    e = len(numsArr) - 1
    while s < e:
        mid = (s + e) // 2

        if numsArr[mid] > numsArr[mid + 1]:
            return mid
        elif numsArr[mid] > numsArr[len(nums) - 1] and numsArr[mid] < numsArr[mid + 1]:
            s = mid + 1
        elif mid > 0 and numsArr[mid] < numsArr[mid - 1]:
            e = mid
    return s

print(findPivot(nums))