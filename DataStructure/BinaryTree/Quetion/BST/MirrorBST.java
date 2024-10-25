
// Mirror Image
import TreeUtils.BinaryTree;
import TreeUtils.Node;

public class MirrorBST {

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        int nodes[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = BinaryTree.buildBST(root, nodes[i]);
        }

        root = mirror(root);
        preOrder(root);
    }
}