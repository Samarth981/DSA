import TreeUtils.BinaryTree;
import TreeUtils.Node;

public class rootToLeaf {

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = BinaryTree.buildBST(root, value[i]);
        }
    }
}
