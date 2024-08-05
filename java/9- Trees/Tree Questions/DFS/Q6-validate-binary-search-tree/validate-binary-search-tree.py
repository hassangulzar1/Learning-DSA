# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self,node,low,hi):
        if node is None:
            return True
        
        if low is not None and node.val <= low:
            return False
        if hi is not None and node.val >= hi:
            return False
        
        left = self.helper(node.left,low,node.val)
        right = self.helper(node.right,node.val,hi)

        return left and right


    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.helper(root,None,None)
        