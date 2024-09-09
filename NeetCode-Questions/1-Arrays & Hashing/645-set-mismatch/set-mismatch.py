class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        ans = [0,0]
        
        for n in nums:
            n = abs(n)
            if nums[n - 1] < 0:
                ans[0] = n
            
            nums[n - 1] = -nums[n - 1]
        
        for i,n in enumerate(nums):
            if n > 0 and i + 1 != ans[0]:
                ans[1] = i + 1
                return ans


        
        
        