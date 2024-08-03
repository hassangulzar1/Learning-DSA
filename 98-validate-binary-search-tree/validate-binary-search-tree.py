# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,node,lo,hi):
        if node is None:
            return True
        
        if lo is not None and node.val <= lo:
            return False
        
        if hi is not None and node.val >= hi:
            return False
        
        left = self.helper(node.left,lo,node.val)
        right = self.helper(node.right,node.val,hi)

        return left and right
        


    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.helper(root,None,None)
        