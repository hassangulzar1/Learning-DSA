# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.count = 0
    def helper(self,node,k):
        if node is None:
            return None
        
        left = self.helper(node.left,k)
        if left is not None:
            return left
        
        self.count += 1

        if self.count == k:
            return node

        return self.helper(node.right,k)

    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        return self.helper(root,k).val

        