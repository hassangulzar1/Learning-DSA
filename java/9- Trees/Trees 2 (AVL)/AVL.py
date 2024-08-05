# class AVL:
#     class Node:
#         def __init__(self, value) -> None:
#             self.value = value
#             self.left = None
#             self.right = None
#             self.height = 0
# 
#     def __init__(self) -> None:
#         self.root = None
# 
#     def height(self, node):
#         if node is None:
#             return -1
#         return node.height
# 
#     def is_empty(self):
#         return self.root is None
# 
#     def insert(self, value):
#         self.root = self._insert(value, self.root)
# 
#     def _insert(self, value, node):
#         if node is None:
#             return self.Node(value)
# 
#         if value < node.value:
#             node.left = self._insert(value, node.left)
#         elif value > node.value:
#             node.right = self._insert(value, node.right)
# 
#         node.height = max(self.height(node.left), self.height(node.right)) + 1
# 
#         return self.rotate(node)
# 
#     def rotate(self, node):
#         balance = self.height(node.left) - self.height(node.right)
#         
#         if balance > 1:
#             if self.height(node.left.left) >= self.height(node.left.right):
#                 # Left Left Case
#                 return self.rightRotate(node)
#             else:
#                 # Left Right Case
#                 node.left = self.leftRotate(node.left)
#                 return self.rightRotate(node)
# 
#         if balance < -1:
#             if self.height(node.right.right) >= self.height(node.right.left):
#                 # Right Right Case
#                 return self.leftRotate(node)
#             else:
#                 # Right Left Case
#                 node.right = self.rightRotate(node.right)
#                 return self.leftRotate(node)
# 
#         return node
# 
#     def rightRotate(self, p):
#         c = p.left
#         t = c.right
# 
#         c.right = p
#         p.left = t
# 
#         p.height = max(self.height(p.left), self.height(p.right)) + 1
#         c.height = max(self.height(c.left), self.height(c.right)) + 1
#         return c
# 
#     def leftRotate(self, c):
#         p = c.right
#         t = p.left
# 
#         p.left = c
#         c.right = t
# 
#         p.height = max(self.height(p.left), self.height(p.right)) + 1
#         c.height = max(self.height(c.left), self.height(c.right)) + 1
#         return p
# 
#     def populate(self, nums):
#         for num in nums:
#             self.insert(num)
# 
#     def populateSorted(self, nums):
#         self.__populateSorted(nums, 0, len(nums))
# 
#     def __populateSorted(self, nums, start, end):
#         if start >= end:
#             return
# 
#         mid = (start + end) // 2
# 
#         self.insert(nums[mid])
# 
#         self.__populateSorted(nums, start, mid)
#         self.__populateSorted(nums, mid + 1, end)
# 
#     def balanced(self):
#         return self._balanced(self.root)
# 
#     def _balanced(self, node):
#         if node is None:
#             return True
# 
#         return abs(self.height(node.left) - self.height(node.right)) <= 1 and self._balanced(node.left) and self._balanced(node.right)
# 
#     def display(self):
#         self._display(self.root, "Root Node: ")
# 
#     def _display(self, node, details):
#         if node is None:
#             return
# 
#         print(details + str(node.value))
#         self._display(node.left, "Left child of " + str(node.value) + " : ")
#         self._display(node.right, "Right child of " + str(node.value) + " : ")
# 
# 
# tree = AVL()
# nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# 
# for i in range(1000):
#     tree.insert(i)
# 
# print(tree.height(tree.root))

class AVL:
    class Node:
        def __init__(self, value):
            self.value = value
            self.left = None
            self.right = None
            self.height = 0

    def __init__(self):
        self.root = None

    def height(self):
        return self._height(self.root)

    def _height(self, node):
        if node is None:
            return -1
        return node.height

    def insert(self, value):
        self.root = self._insert(value, self.root)

    def _insert(self, value, node):
        if node is None:
            node = self.Node(value)
            return node

        if value < node.value:
            node.left = self._insert(value, node.left)
        elif value > node.value:
            node.right = self._insert(value, node.right)

        node.height = max(self._height(node.left), self._height(node.right)) + 1
        return self._rotate(node)

    def _rotate(self, node):
        if self._height(node.left) - self._height(node.right) > 1:
            # left heavy
            if self._height(node.left.left) - self._height(node.left.right) > 0:
                # left left case
                return self._right_rotate(node)
            if self._height(node.left.left) - self._height(node.left.right) < 0:
                # left right case
                node.left = self._left_rotate(node.left)
                return self._right_rotate(node)

        if self._height(node.left) - self._height(node.right) < -1:
            # right heavy
            if self._height(node.right.left) - self._height(node.right.right) < 0:
                # right right case
                return self._left_rotate(node)
            if self._height(node.right.left) - self._height(node.right.right) > 0:
                # right left case
                node.right = self._right_rotate(node.right)
                return self._left_rotate(node)

        return node

    def _right_rotate(self, p):
        c = p.left
        t = c.right

        c.right = p
        p.left = t

        p.height = max(self._height(p.left), self._height(p.right)) + 1
        c.height = max(self._height(c.left), self._height(c.right)) + 1

        return c

    def _left_rotate(self, c):
        p = c.right
        t = p.left

        p.left = c
        c.right = t

        p.height = max(self._height(p.left), self._height(p.right)) + 1
        c.height = max(self._height(c.left), self._height(c.right)) + 1

        return p

    def populate(self, nums):
        for num in nums:
            self.insert(num)

    def populate_sorted(self, nums):
        self._populate_sorted(nums, 0, len(nums))

    def _populate_sorted(self, nums, start, end):
        if start >= end:
            return

        mid = (start + end) // 2

        self.insert(nums[mid])
        self._populate_sorted(nums, start, mid)
        self._populate_sorted(nums, mid + 1, end)

    def display(self):
        self._display(self.root, "Root Node: ")

    def _display(self, node, details):
        if node is None:
            return
        print(details + str(node.value))
        self._display(node.left, "Left child of " + str(node.value) + " : ")
        self._display(node.right, "Right child of " + str(node.value) + " : ")

    def is_empty(self):
        return self.root is None

    def balanced(self):
        return self._balanced(self.root)

    def _balanced(self, node):
        if node is None:
            return True
        return abs(self._height(node.left) - self._height(node.right)) <= 1 and self._balanced(node.left) and self._balanced(node.right)

# Example usage
tree = AVL()
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

for i in range(1000):
    tree.insert(i)

print(tree.height())
