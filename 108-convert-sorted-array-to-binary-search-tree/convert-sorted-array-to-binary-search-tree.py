# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self) -> None:
        self.root = None
   
    def insert(self,value):
        self.root = self._insert(value,self.root)

    def _insert(self,value,node):
        if node is None:
            return TreeNode(value)
        
        if value < node.val:
            node.left = self._insert(value,node.left)
        elif value > node.val:
            node.right = self._insert(value,node.right)
        

        return node

    def __populateSorted(self,nums,start,end):
        if start >= end:
            return
        
        mid = (start + end) // 2

        self.insert(nums[mid])

        self.__populateSorted(nums,start,mid)
        self.__populateSorted(nums,mid + 1, end)

    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        self.__populateSorted(nums,0,len(nums))

        return self.root


       

        