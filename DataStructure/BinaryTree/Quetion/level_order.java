import java.util.LinkedList;
import java.util.Queue;

public class level_order {
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
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            // secount level
            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println(); // next line

                    if (q.isEmpty()) { // last node
                        break;
                    } else {
                        q.add(null);
                    }
                } else { // currnode is some data not null
                    System.out.print(currNode.data + " ");

                    // adding
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }

        public static int Hight(Node root) {
            if (root == null) {
                return 0;
            }

            int left_hight = Hight(root.left);
            int right_hight = Hight(root.right);
            int hight = Math.max(left_hight, right_hight) + 1;
            return hight;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);

        tree.levelOrder(root);
        System.out.println(tree.Hight(root));
    }
}
