class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:

        def helper(p,up):
            if len(up) == 0:
                return [p]

            temp = [up[0]]

            left = helper(p + temp, up[1:])
            right = helper(p, up[1:])
            return left + right
        return helper([],nums)
        