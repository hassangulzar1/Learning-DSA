class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        cur,nxt = 0 , 0
        count = 1

        while nxt < len(nums):
            if nums[cur] != nums[nxt]:
                nums[cur + 1] = nums[nxt]
                cur += 1
                count += 1
            nxt += 1

        return count


        