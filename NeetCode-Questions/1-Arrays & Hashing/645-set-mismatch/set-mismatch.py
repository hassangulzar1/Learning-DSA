class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        ans = [0,0]
        count = Counter(nums)

        for i in range(1,len(nums) + 1):
            if count[i] == 0:
                ans[1] = i

            if count[i] == 2:
                ans[0] = i
        return ans


        
        
        