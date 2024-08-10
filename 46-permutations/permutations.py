class Solution:
    def helper(self,i,nums):
        if i == len(nums):
            return [[]]
        

        perms = self.helper(i + 1,nums)
        res = []

        for p in perms:
            for j in range(len(p) + 1):
                pcopy = p.copy()
                pcopy.insert(j,nums[i])
                res.append(pcopy)

        return res




    def permute(self, nums: List[int]) -> List[List[int]]:
       return self.helper(0,nums)