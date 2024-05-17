from collections import deque

nums = [1,-1]
k = 1

# if not nums:
    # return []

# if k == 1:
#    return nums


ans = []
d = deque()

l = 0
for i in range (len(nums)):   
    
      
    while d and nums[d[-1]] < nums[i]:
        d.pop()

    d.append(i)
    if l > d[0]:
        d.popleft()

    if i >= k - 1:
        ans.append(nums[d[0]])
        l += 1

print(ans)