# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,node,sum):
        if node is None:
            return 0
        
        sum = sum * 10 + node.val

        if node.left is None and node.right is None:
            return sum
        
        return self.helper(node.left, sum) + self.helper(node.right,sum)


        


    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        return self.helper(root,0)
        