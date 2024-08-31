class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        maping = {}

        countingPairs = 0

        for i in nums:
            maping[i] = 1 + maping.get(i,0)
        
        for i in maping.values():
            countingPairs += i * (i - 1) // 2
        return countingPairs

        

