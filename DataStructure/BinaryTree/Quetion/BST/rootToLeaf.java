import java.util.ArrayList;

import TreeUtils.BinaryTree;
import TreeUtils.Node;

//print all path root to leaf
public class rootToLeaf {

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.data); // curr add in path

        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path); // call left sub
        printRoot2Leaf(root.right, path); // call right

        path.remove(path.size() - 1); // backtrack
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = BinaryTree.buildBST(root, value[i]);
        }

        printRoot2Leaf(root, new ArrayList<Integer>());
    }
}
