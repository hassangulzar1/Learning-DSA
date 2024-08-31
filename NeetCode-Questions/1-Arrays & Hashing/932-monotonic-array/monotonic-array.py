class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        isIncreasing = False

        if nums[0] < nums[len(nums) - 1]:
            isIncreasing = True

        for i in range(len(nums) - 1):
            if isIncreasing:
                if nums[i] > nums[i + 1] :
                    return False
            else:
                if  nums[i] < nums[i + 1] :
                    return False   

        return True             

            
        