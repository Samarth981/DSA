import TreeUtils.BinaryTree;
import TreeUtils.Node;

public class SortArrayBST {
    // after creat finle tree then use in print
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node creatBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = creatBST(arr, start, mid - 1);
        root.right = creatBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String args[]) {
        int nodes[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = BinaryTree.buildBST(root, nodes[i]);
        }

        root = creatBST(nodes, 0, nodes.length - 1);
        preOrder(root);
    }
}
