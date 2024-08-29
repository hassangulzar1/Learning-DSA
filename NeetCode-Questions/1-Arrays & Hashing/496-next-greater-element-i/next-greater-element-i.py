class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        num1Indx = {n:i for i,n in enumerate(nums1)}

        res = [-1] * len(nums1)

        stack = []

        for i in range(len(nums2)):
           curr = nums2[i]
           while stack and curr > stack[-1]:
              val = stack.pop()
              indx = num1Indx[val]
              res[indx] = curr
           if curr in num1Indx:
                stack.append(curr)
        

        return res
        