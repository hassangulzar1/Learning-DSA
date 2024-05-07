nums = [-1,0,1,2,-1,-4]
nums.sort()
ans =[]

for i, a in enumerate(nums):
    if i > 0 and nums[i] == nums[i - 1]: continue
    center = i + 1
    j = len(nums) - 1
    while center < j:
        if a + nums[center] + nums[j] == 0:
            ans.append([a, nums[center], nums[j]])
            center += 1
            while nums[center] == nums[center -1] and center < j:
                center += 1
        elif a + nums[center] + nums[j] < 0:
            center += 1
        else:
            j -= 1
                 

print(ans)