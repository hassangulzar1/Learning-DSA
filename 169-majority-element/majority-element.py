class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hashMap = {}
        for num in nums:
            hashMap[num] = 1 + hashMap.get(num,0)
        for key, value in hashMap.items():
            if value >= len(nums) / 2:
                return key

        