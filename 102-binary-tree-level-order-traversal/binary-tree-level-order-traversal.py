# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        from collections import deque
        ans = []
        if root is None:
            return ans

        d = deque([root])
        while d:
            currLevel = []
            for i in range(len(d)):
                currNode = d.popleft()                
                currLevel.append(currNode.val)
                
                if currNode.left:
                    d.append(currNode.left)
                if currNode.right:
                    d.append(currNode.right)
            
            ans.append(currLevel)
        return ans
        