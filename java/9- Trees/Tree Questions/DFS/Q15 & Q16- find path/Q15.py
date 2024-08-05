class Solution:
    def helper(self,node,arr,index):
        if node is None:
            return False
        
        if index >= len(arr) or node.val != arr[index]:
            return False
        
        if (node.left == None and node.right == None and index == len(arr) - 1):
            return True
        
        return self.helper(node,arr,index + 1) or self.helper(node,arr,index + 1)
    

    def finPath(self,root,arr):
        if root is None:
            return len(arr) == 0
        
        return self.helper(root,arr,0)
