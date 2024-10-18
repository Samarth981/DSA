import TreeUtils.BinaryTree;
import TreeUtils.Node;

public class DeleteNode {
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null; // Value not found, return null
        }

        // Search for the node to delete
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Both children
            Node successor = findInorderSuccessor(root.right);
            root.data = successor.data; // Replace with inorder successor
            root.right = delete(root.right, successor.data); // Delete the successor
        }
        return root; // Return the updated root
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2); // Go right if the current value is less than k1
        } else {
            printInRange(root.left, k1, k2); // Go left if the current value is greater than k2
        }
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = BinaryTree.buildBST(root, value[i]);
        }

        System.out.println("In-order Traversal of the BST:");
        inOrder(root);
        System.out.println();

        System.out.println("Values in range [5, 12]:");
        printInRange(root, 5, 12);
        System.out.println();

        root = delete(root, 5);
        System.out.println("In-order Traversal after deleting 5:");
        inOrder(root);
        System.out.println();
    }
}
