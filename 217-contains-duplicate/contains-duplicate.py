class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dupimap = {}

        for num in nums:
            if num in dupimap:
                return True
            dupimap[num] = 1
        
        return False
        