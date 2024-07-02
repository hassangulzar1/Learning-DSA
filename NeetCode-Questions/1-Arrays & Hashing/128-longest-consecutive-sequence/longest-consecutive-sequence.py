class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        highest = 0
        nums_set = set(nums)

        for n in nums_set:
            if (n -1) not in nums_set:
                count = 1
                while n + count in nums_set:
                    count += 1
                highest = max(count,highest)

        return highest
    