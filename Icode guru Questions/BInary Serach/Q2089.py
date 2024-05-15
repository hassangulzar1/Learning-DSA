nums = [1,2,5,2,3]
target = 2

nums.sort()
ansArray = []

s = 0
e = len(nums) -1

while s < e:
     mid = (s + e)  // 2

     if nums[mid] >= target :
       e = mid
     else:
       s = mid + 1

for i in range(s,len(nums)):
   if nums[i] == target:
      ansArray.append(i)
   else:
       print(ansArray)
       break