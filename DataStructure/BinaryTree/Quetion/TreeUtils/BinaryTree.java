package TreeUtils;

public class BinaryTree {
    public static Node buildBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }
}
