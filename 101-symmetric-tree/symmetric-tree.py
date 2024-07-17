# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        from collections import deque

        if root is None:
            return False
        
        d = deque()
        d.append(root.left)
        d.append(root.right)

        while d:
            left = d.popleft()
            right = d.popleft()
            if left is None and right is None:
                continue
            
            if left is None or right is None:
                return False
            
            if left.val != right.val:
                return False
            
            d.append(left.left)
            d.append(right.right)
            d.append(left.right)
            d.append(right.left)
        return True

        

        