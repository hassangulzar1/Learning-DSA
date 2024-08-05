# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findNode(self,node,x):
        if node is None:
            return None
        
        if node.val == x:
            return node
        
        n = self.findNode(node.left,x)

        if n is not None:
            return n
        
        return self.findNode(node.right,x)
    
    def sibling(self,node,x,y):
        if node is None:
            return False
        
        return (node.left == x and node.right == y) or (node.left == y and node.right == x) or self.sibling(node.left,x,y) or self.sibling(node.right,x,y)
    
    def level(self,node,x,lev):
        if node is None:
            return 0
        
        if node == x:
            return lev
        
        l = self.level(node.left,x,lev + 1)

        if l is not 0:
            return l
        
        return self.level(node.right,x,lev + 1)




    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        xx = self.findNode(root,x)
        yy = self.findNode(root,y)

        return (self.level(root,xx,0) == self.level(root,yy,0)) and (not self.sibling(root,xx,yy))
        