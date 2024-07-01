class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        s = 0
        for e in range(len(nums)):
            if nums[e] != 0:
                temp = nums[s]
                nums[s] = nums[e]
                nums[e] = temp 
                s += 1
       

        
           
   

            
            

        