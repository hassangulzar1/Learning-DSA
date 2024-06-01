nums1 = [1,2]
nums2 = [3]

myArr = sorted(nums1 + nums2) 

size = len(myArr) // 2
if len(myArr) % 2 == 0:
    print((myArr[size - 1] + myArr[size]) / 2)
else:
    print(myArr[size])