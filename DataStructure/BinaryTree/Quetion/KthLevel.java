
import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {
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

    public static void KthLevels(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KthLevels(root.left, k, level + 1);
        KthLevels(root.right, k, level + 1);
    }

    // using level order
    public static void KthLevels_2(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Add `null` as a marker for the end of the first level

        while (!q.isEmpty()) {
            Node curNode = q.remove();

            if (curNode == null) {
                level++; // Increment level after finishing one level of nodes
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (k == level) {
                    System.out.print(curNode.data + " ");
                }
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);
        KthLevels(root, 2, 1);
        System.out.println();
        KthLevels_2(root, 2, 1);
    }
}
