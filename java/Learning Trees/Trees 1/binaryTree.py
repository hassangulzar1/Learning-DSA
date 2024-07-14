class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None

    def populate(self):
        value = int(input("Enter the root Node: "))
        self.root = Node(value)
        self._populate(self.root)

    def _populate(self, node):
        left = input(f"Do you want to enter left of {node.value} (true/false): ").lower() == 'true'
        if left:
            value = int(input(f"Enter the value of the left of {node.value}: "))
            node.left = Node(value)
            self._populate(node.left)

        right = input(f"Do you want to enter right of {node.value} (true/false): ").lower() == 'true'
        if right:
            value = int(input(f"Enter the value of the right of {node.value}: "))
            node.right = Node(value)
            self._populate(node.right)

    def display(self):
        self._display(self.root, "")

    def _display(self, node, indent):
        if node is None:
            return
        print(indent + str(node.value))
        self._display(node.left, indent + "\t")
        self._display(node.right, indent + "\t")

    def pretty_display(self):
        self._pretty_display(self.root, 0)

    def _pretty_display(self, node, level):
        if node is None:
            return
        self._pretty_display(node.right, level + 1)
        if level != 0:
            for i in range(level - 1):
                print("|\t\t", end="")
            print("|------->" + str(node.value))
        else:
            print(node.value)
        self._pretty_display(node.left, level + 1)

    def pre_order(self):
        self._pre_order(self.root)
        print()

    def _pre_order(self, node):
        if node is None:
            return
        print(node.value, end=" ")
        self._pre_order(node.left)
        self._pre_order(node.right)

    def in_order(self):
        self._in_order(self.root)
        print()

    def _in_order(self, node):
        if node is None:
            return
        self._in_order(node.left)
        print(node.value, end=" ")
        self._in_order(node.right)

    def post_order(self):
        self._post_order(self.root)
        print()

    def _post_order(self, node):
        if node is None:
            return
        self._post_order(node.left)
        self._post_order(node.right)
        print(node.value, end=" ")

tree = BinaryTree()
tree.populate()
print("\nPretty display:")
tree.pretty_display()
