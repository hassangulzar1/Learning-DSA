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
    
    def populate(self,nums):
        for i in range(len(nums)):
            self.insert(nums[i])

    def populateSorted(self,nums):
        self.__populateSorted(nums,0,len(nums))
    
    def __populateSorted(self,nums,start,end):
        if start >= end:
            return
        
        mid = (start + end) // 2

        self.insert(nums[mid])

        self.__populateSorted(nums,start,mid)
        self.__populateSorted(nums,mid + 1, end)


    
    def balanced(self):
        return self._balanced(self.root)
    
    def _balanced(self,node):
        if node is None:
            return True
        
        return abs(self.height(node.left) - self.height(node.right)) <= 1 and self._balanced(node.left) and self._balanced(node.right)
    
    def display(self):
        self._display(self.root,"Root Node: ")

    def _display(self,node,details):
        if node is None:
            return
        
        print(details + str(node.value))
        self._display(node.left, "Left child of " + str(node.value) + " : ")
        self._display(node.right, "Right child of " + str(node.value) + " : ")



tree = BST()
nums = [1,2,3,4,5,6,7,8,9,10]
tree.populateSorted(nums)

tree.display()

    
    



