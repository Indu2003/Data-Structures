class Node:
	def __init__(self, key):
		self.left = None
		self.right = None
		self.val = key

def printLeaf(root):

	if root:
		# Traverse the left subtree
		printLeaf(root.left)
		
        # Traverse the right subtree
		printLeaf(root.right)
		
		# Check if the current node is a leaf node
		if root.left is None and root.right is None:
			print(root.val, end=" ")  # Print the leaf node value
		
if __name__ == "__main__":
	root = Node(1)
	root.left = Node(3)
	root.right = Node(5)
	root.right.left = Node(16)
	root.right.right = Node(7)
	root.right.right.left=Node(9)
	root.right.right.right=Node(13)

	# Function call
	print("Leaf nodes of the binary tree is")
	printLeaf(root)

