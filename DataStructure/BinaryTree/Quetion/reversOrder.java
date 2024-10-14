import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversOrder {
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

    public static void revers(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            s.push(curr);
            // Add right child first, then left child
            if (curr.right != null) {
                q.add(curr.right);
            }
            if (curr.left != null) {
                q.add(curr.left);
            }
        }

        // Pop all nodes from the stack to get them in reverse level order
        while (!s.isEmpty()) {
            System.out.print(s.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BuildTree tree = new BuildTree();
        Node root = BuildTree.build(nodes);
        revers(root);
    }
}