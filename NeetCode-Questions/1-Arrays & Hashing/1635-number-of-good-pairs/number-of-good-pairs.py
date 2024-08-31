class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        maping = {}

        res = 0

        for n in nums:
            if n in maping:
                res += maping[n]
                maping[n] += 1
            else:
                maping[n] = 1
        return res




        

