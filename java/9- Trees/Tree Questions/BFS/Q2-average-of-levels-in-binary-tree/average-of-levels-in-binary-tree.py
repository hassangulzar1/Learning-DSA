# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        averages = []

        if root is None:
            return averages
        
        queue = deque([root])

        while queue:
            levelSize = len(queue)
            avg = 0
            for i in range(levelSize):
                currNode = queue.popleft()
                avg += currNode.val

                if currNode.left:
                    queue.append(currNode.left)                               
                                
                if currNode.right:
                    queue.append(currNode.right)
            avg = (avg / levelSize)
            
            averages.append(avg)

        return averages
        