class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        arrSum = 0

        for num in nums:
            arrSum += num
        
        left = 0
        for i in range(len(nums)):
            arrSum -= nums[i]
            if arrSum == left:
                return i
            left += nums[i]
        return -1
        