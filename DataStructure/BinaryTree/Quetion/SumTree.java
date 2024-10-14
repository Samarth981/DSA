public class SumTree {
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

    public static int SumTransform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftChild = SumTransform(root.left);
        int rightChild = SumTransform(root.right);

        int data = root.data;
        int newLeftData = root.left == null ? 0 : root.left.data;
        int newRightData = root.right == null ? 0 : root.right.data;

        root.data = newLeftData + leftChild + newRightData + rightChild;
        return data;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7 };

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         * 
         * 27
         * / \
         * 9 13
         * / \ / \
         * 0 0 0 0
         */

        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);
        SumTransform(root);
        preOrder(root);
    }
}
