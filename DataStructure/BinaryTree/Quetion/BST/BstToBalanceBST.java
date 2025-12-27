import TreeUtils.BinaryTree;
import TreeUtils.Node;
import java.util.ArrayList;
public class BstToBalanceBST {
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node sortBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = sortBST(inorder, start, mid - 1);
        root.right = sortBST(inorder, mid + 1, end);
        return root;
    }

    public static Node balanceBST(Node root) { // total - O(n)

        // inorder seq O(n)
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // sorted inorder -> balanceBst O(n)
        root = sortBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        int nodes[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = null;

        for (int idx = 0; idx < nodes.length; idx++) {
            root = BinaryTree.buildBST(root, nodes[idx]);
        }

        root = balanceBST(root);
        preOrder(root);
    }
}
