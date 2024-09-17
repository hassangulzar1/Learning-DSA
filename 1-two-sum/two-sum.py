class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hasMap = {}

        for i in range(len(nums)):
            if(target - nums[i]) in hasMap:
                return [i,hasMap[target - nums[i]]]
            hasMap[nums[i]] = i
        return [-1,-1]



        