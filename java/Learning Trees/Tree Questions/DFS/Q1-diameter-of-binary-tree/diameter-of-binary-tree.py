class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.diameter = 0  # Initialize a class-level variable to store the maximum diameter
        
        def height(node):
            if node is None:
                return 0
            
            # Recursively calculate the height of left and right subtrees
            leftHeight = height(node.left)
            rightHeight = height(node.right)
            
            # Calculate the diameter passing through the current node
            currentDiameter = leftHeight + rightHeight
            
            # Update the maximum diameter found so far
            self.diameter = max(self.diameter, currentDiameter)
            
            # Return the height of the subtree rooted at this node
            return max(leftHeight, rightHeight) + 1
        
        # Call the height function to compute the maximum diameter starting from the root
        height(root)
        
        # Return the maximum diameter found
        return self.diameter
