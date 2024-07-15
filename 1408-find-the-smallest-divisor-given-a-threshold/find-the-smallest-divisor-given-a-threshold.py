class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        import math

        s , e = 1 , max(nums)

        while s <= e:

            mid = (s + e) // 2

            sums = 0
            for i in nums:
                sums += math.ceil(i / mid)
            
            if sums <= threshold:
                e = mid - 1
            else:
                s = mid + 1
        return s

        