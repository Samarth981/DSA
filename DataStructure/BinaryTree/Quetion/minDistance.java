public class minDistance {
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

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDis = lcaDist(root.left, n);
        int rightDis = lcaDist(root.right, n);

        if (leftDis == -1 && rightDis == -1) { // both are null
            return -1;
        } else if (leftDis == -1) {
            return rightDis + 1;
        } else {
            return leftDis + 1;
        }
    }

    public static int minDis(Node root, int n1, int n2) { // const space complexcity
        // find lca
        Node lca = lca(root, n1, n2);

        // find lca to n1 or n2 distance
        int dis1 = lcaDist(lca, n1);
        int dis2 = lcaDist(lca, n2);
        int dis = dis1 + dis2;
        return dis;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, 7, -1, -1 };

        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);
        int n1 = 4, n2 = 5;
        System.out.println(minDis(root, n1, n2));
    }
}
