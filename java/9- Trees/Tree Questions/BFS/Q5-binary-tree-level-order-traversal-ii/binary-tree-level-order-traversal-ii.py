# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        from collections import deque

        result = []

        if root is None:
            return result  

        d = deque([root])

        while d:
            levelSize = len(d)
            currLevel = []
            for i in range(levelSize):
                currNode = d.popleft()
                currLevel.append(currNode.val)
                if currNode.left:
                    d.append(currNode.left)
                
                if currNode.right :
                    d.append(currNode.right)
                
            result.insert(0,currLevel)

        return result
        