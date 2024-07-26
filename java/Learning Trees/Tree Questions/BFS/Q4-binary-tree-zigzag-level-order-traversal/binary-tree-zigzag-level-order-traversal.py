# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        from collections import deque

        result = []

        if root is None:
            return result  

        d = deque([root])
        rev = False  

        while d:
            levelSize = len(d)
            currLevel = []

            for i in range(levelSize):
                if rev:
                    currNode = d.pop()
                    currLevel.append(currNode.val)
                    if currNode.right:
                       d.appendleft(currNode.right)

                    if currNode.left:
                       d.appendleft(currNode.left)                
                    
                else:
                  currNode = d.popleft()
                  currLevel.append(currNode.val)
                  if currNode.left:
                     d.append(currNode.left)
                
                  if currNode.right :
                     d.append(currNode.right)

            rev = not rev                                     
            result.append(currLevel)

        return result

        