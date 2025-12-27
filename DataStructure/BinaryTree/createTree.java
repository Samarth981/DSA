//create binary tree using preorder

public class createTree {

    // creat node
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

    static class BinaryTree {

        static int index = -1; // starting stage

        public static Node buildBinaryTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]); // create node obj
            newNode.left = buildBinaryTree(nodes); // call left part
            newNode.right = buildBinaryTree(nodes); // call right part

            return newNode;
        }

        public static void preorder(Node root) { // O(N)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left); // print all left subtree
            preorder(root.right); // print all right subtree
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // creat obj
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinaryTree(nodes);
        tree.preorder(root);
    }
}
