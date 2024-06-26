public class Node {
    
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}


public class BinaryTree {
    Node root;

   
    BinaryTree() {
        root = null;
    }

    
    int height(Node node) {
        if (node == null)
            return 0;
        else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            // Return the maximum of leftHeight and rightHeight + 1
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

       
        int treeHeight = tree.height(tree.root);
        System.out.println("Height of the tree is: " + treeHeight);
    }
}
