import TreeUtils.BinaryTree;
import TreeUtils.Node;

public class searchKey {
    public static boolean search(Node root, int key) { // O(H)
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 6, 7 };
        int key = 5;
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = BinaryTree.buildBST(root, value[i]);
        }

        if (search(root, key)) {
            System.out.println("key is found");
        } else {
            System.out.println("key is not found");
        }
    }
}
