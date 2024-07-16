"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        from collections import deque
        

        if root is None:
            return root  

        d = deque([root])

        while d:
            levelSize = len(d)
            currLevel = []
            prevNode = None

            for i in range(len(d)):
                currNode = d.popleft()
                if prevNode:
                    prevNode.next = currNode

                prevNode = currNode


                if currNode.left:
                    d.append(currNode.left)
                
                if currNode.right :
                    d.append(currNode.right)
            prevNode.next = None
            

        return root
        