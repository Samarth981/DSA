
//check bst is valid or not
import TreeUtils.BinaryTree;
import TreeUtils.Node;

public class validBst {

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = BinaryTree.buildBST(root, nodes[i]);
        }

        if (isValidBST(root, null, null)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}