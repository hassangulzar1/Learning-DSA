class Solution:
    def helper(self,i,nums,curr,res):
        if i >= len(nums):
            res.append(curr.copy())
            return 
        
        curr.append(nums[i])
        self.helper(i + 1, nums,curr,res)

        curr.pop()

        while i + 1 < len(nums) and nums[i] == nums[i + 1]:
            i += 1
        
        self.helper(i + 1, nums,curr,res)

    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        curr = []
        res = []
        self.helper(0,nums,curr,res)
        return res

        