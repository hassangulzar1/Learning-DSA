class NumArray:

    def __init__(self, nums: List[int]):
        self.prefixSum = [] 
        curr = 0

        for i in range(len(nums)):
            curr += nums[i]
            self.prefixSum.append(curr)
        

    def sumRange(self, left: int, right: int) -> int:
        rightSum = self.prefixSum[right]
        leftSum = self.prefixSum[left - 1] if left > 0 else 0
        return rightSum - leftSum

        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)