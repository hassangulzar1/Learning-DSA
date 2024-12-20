class Solution:
    def specialArray(self, nums: List[int]) -> int:
        count = [0] * (len(nums) + 1)

        for n in nums:
          index = min(n,len(nums))
 
          count[index] += 1
        total_right = 0

        for i in reversed(range(len(nums) + 1)):
            total_right += count[i]
            if i == total_right:
                return total_right
        return -1
        





        