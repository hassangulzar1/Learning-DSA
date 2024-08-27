class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:

        length,maxLen = 0,0
        zeros = 0

        l = 0

        for r in range(len(nums)):
            if nums[r] == 0:
                zeros += 1
            
            if zeros > k:
                while nums[l] != 0 and l < len(nums):
                    l += 1
                l += 1
                zeros -= 1
            else:
                length = r - l + 1
            maxLen = max(length,maxLen)
        return maxLen
        