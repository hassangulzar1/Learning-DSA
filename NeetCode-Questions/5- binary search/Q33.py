nums = [7,8,1,2,3,4,5,6]
target = 2


def findPivot(numsArr):
    s = 0
    e = len(numsArr) - 1
    while s < e:
        mid = (s + e) // 2

        if numsArr[mid] > numsArr[mid + 1]:
            return mid
        elif numsArr[mid] > numsArr[len(nums) - 1] and numsArr[mid] < numsArr[mid + 1]:
            s = mid + 1
        else:
            e = mid
    return s

def binarSearch(numsArr,tar,s,e):

    while s <= e:
        mid = (s + e) //2

        if numsArr[mid] == tar:
            return mid
        elif numsArr[mid] < tar:
            s = mid + 1
        else:
            e = mid -1
    return -1


if nums[0] < nums[len(nums) - 1]:
    print(binarSearch(nums,target,0,len(nums) -1))
pivot = findPivot(nums)

ans = binarSearch(nums,target,0,pivot)
if ans == -1:
 print(binarSearch(nums,target,pivot + 1, len(nums) - 1))


