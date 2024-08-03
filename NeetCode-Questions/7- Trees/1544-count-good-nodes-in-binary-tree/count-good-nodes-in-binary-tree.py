# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.count = 0
    
    def helper(self,node,maxValue):
        if node is None:
            return        
        if node.val >= maxValue :
            self.count += 1
        
        maxValue = max(maxValue,node.val)

        self.helper(node.left,maxValue)
        self.helper(node.right, maxValue)

    def goodNodes(self, root: TreeNode) -> int:
        self.helper(root, root.val)

        return self.count



        