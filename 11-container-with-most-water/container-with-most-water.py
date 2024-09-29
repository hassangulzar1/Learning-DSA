class Solution:
    def maxArea(self, height: List[int]) -> int:
        s = 0
        e = len(height) - 1

        ans = 0
        while s < e:
            multiPlication = min(height[s], height[e])
            ans = ans if multiPlication * (e - s) < ans else multiPlication * (e - s)
            if height[s] < height[e]:
                s += 1
            else:
                e -= 1
        return ans
