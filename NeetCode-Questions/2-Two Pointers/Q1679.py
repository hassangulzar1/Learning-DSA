
nums = [1,2,3,4]
k = 5

ans = 0
l,r = 0 , len(nums) - 1
        
nums.sort()
while l < r:
   if nums[l] + nums[r] > k:
     r -= 1
   elif nums[l] + nums[r] < k:
     l += 1
   else:
     ans += 1
     l += 1
     r -= 1

print(ans)