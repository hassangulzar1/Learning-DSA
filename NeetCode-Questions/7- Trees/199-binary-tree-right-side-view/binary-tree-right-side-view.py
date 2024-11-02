# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:

        ans = []
        if root is None:
            return ans

        q = collections.deque()
        q.append(root)

        while q:
            qLen = len(q)
            currLevel = []

            for i in range(qLen):
                currNode = q.popleft()
                currLevel.append(currNode.val)

                if currNode.left:
                    q.append(currNode.left)
                if currNode.right:
                    q.append(currNode.right)

            ans.append(currLevel[qLen - 1])
        
        return ans        