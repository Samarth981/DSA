// Check if a Binary Tree is univalued or not

public class univalued {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BuildTree {
        static int index = -1;

        public static Node build(int nodes[]) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }

    public static boolean checkUnivalued(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.data != root.data) {
            return false;
        }
        if (root.right != null && root.right.data != root.data) {
            return false;
        }

        return checkUnivalued(root.left) && checkUnivalued(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3 };
        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);
        System.out.println(checkUnivalued(root));
    }
}