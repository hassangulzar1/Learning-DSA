# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root.val > p.val and root.val > q.val:
            return self.lowestCommonAncestor(root.left,p,q)
        
        if root.val < p.val and root.val < q.val:
            return self.lowestCommonAncestor(root.right,p,q)

        return root

        

#         cur = root
# 
#         while cur:
#             if p.val > cur.val and q.val > cur.val:
#                 cur = cur.right
#             elif p.val < cur.val and q.val < cur.val:
#                 cur = cur.left
#             else:
#                 return cur


class Solution:
    def goodNodes(self, root: TreeNode) -> int:

        def dfs(node, maxVal):
            if not node:
                return 0

            res = 1 if node.val >= maxVal else 0
            
            maxVal = max(maxVal, node.val)
            res += dfs(node.left, maxVal)
            res += dfs(node.right, maxVal)

            return res

        return dfs(root, root.val)