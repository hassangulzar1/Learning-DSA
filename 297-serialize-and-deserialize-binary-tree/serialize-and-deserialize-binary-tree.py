# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def helper(self,node,arr):
        if node is None:
            arr.append("null")
            return
        
        arr.append(str(node.val))
        self.helper(node.left,arr)
        self.helper(node.right,arr)


    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        myArr = []
        self.helper(root,myArr)
        return ','.join(myArr)
        

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        if not data:
            return None

        data = data.split(',')
        data.reverse()
        return  self.helper2(data)
        
    def helper2(self,arr):
        val = arr.pop()

        if val[0] == "n":
            return None
        
        node = TreeNode(int(val))

        node.left = self.helper2(arr)
        node.right = self.helper2(arr)

        return node
        

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))