# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sameTree(self,s,t):
        if s is None and t is None:
            return True
        
        if s is None or t is None:
            return False
        
        return (s.val == t.val) and self.sameTree(s.left,t.left) and self.sameTree(s.right,t.right)

    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not subRoot:
            return True
        if not root:
            return False
        
        if self.sameTree(root,subRoot):
            return True
        
        return (self.isSubtree(root.left,subRoot) or self.isSubtree(root.right,subRoot))
        