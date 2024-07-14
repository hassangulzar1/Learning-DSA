class BST:
    class Node:
        def __init__(self,value) -> None:
            self.value = value
            self.left = None
            self.right = None
            self.height = 0
    
    def __init__(self) -> None:
        self.root = None
    
    def height(self,node):
        if node is None:
            return -1
        return node.height
    
    def is_empty(self):
        return self.root is None
    
    def insert(self,value):
        self.root = self._insert(value,self.root)

    def _insert(self,value,node):
        if node is None:
            return self.Node(value)
        
        if value < node.value:
            node.left = self._insert(value,node.left)
        elif value > node.value:
            node.right = self._insert(value,node.right)
        
        node.height = max(self.height(node.left),self.height(node.right) + 1)
        
        return node
