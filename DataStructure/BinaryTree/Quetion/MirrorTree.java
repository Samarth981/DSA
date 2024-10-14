
public class MirrorTree {
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

        public static Node builds(int nodes[]) {
            index = -1; // Reset the index before building the tree
            return buildsHelper(nodes);
        }

        private static Node buildsHelper(int nodes[]) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildsHelper(nodes);
            newNode.right = buildsHelper(nodes);
            return newNode;
        }
    }

    // function to return the root of inverted tree
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

    // print invers
    // print tree in pre-order (root, left, right)
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Print the root first
        printTree(root.left); // Then print left subtree
        printTree(root.right); // Finally, print right subtree
    }

    public static void main(String[] args) {
        int nodes[] = { 4, 2, 7, 1, 3, 6, 9 };
        BuildTree tree = new BuildTree();
        Node root = BuildTree.builds(nodes);
        mirror(root); // Expected output: 4 7 2 9 6 3 1
        printTree(root);
    }
}
