class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:

        n = len(nums)
        array = [0] * (n + n)

        for i in range(n):
            array[i] = nums[i]
            array[n + i] = nums[i]

        return array
        