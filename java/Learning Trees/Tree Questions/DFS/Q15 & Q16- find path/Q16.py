class Solution:
    def countPaths(self,node,sum):
        path = None

        return self.helper(node,sum,path)
    
    def helper(self,node,sum,path):
        if node is None:
            return 0
        
        path.append(node.val)
        count = 0
        sum = 0

        count += self.helper(node.left,sum,path) + self.helper(node.right,sum,path)

        # backtrack
        path.pop()
        return count