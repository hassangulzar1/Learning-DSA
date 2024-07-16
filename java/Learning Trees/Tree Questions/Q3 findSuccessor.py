# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findSuccessor(self, root,key):
        from collections import deque

        if root is None:
            return None
        
        queue = deque([root])

        while queue:
            currNode = queue.popleft()

            if currNode.left:
                queue.append(currNode.left)                               
                                
            if currNode.right:
                queue.append(currNode.right)
            
            if currNode.val == key:
                break
                
            

        return queue[-1]
        