class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        minScore = float("inf")
        l,r = 0 , k - 1

        while r < len(nums):
            minScore = min(minScore, nums[r] - nums[l])
            l,r = l + 1, r + 1
        return minScore
        