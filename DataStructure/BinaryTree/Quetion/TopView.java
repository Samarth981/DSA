
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
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

    static class info {
        Node node;
        int horizontal_dis;

        public info(Node node, int horizontal_dis) {
            this.node = node;
            this.horizontal_dis = horizontal_dis;
        }
    }

    public static void TopView(Node root) {

        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        // Level order
        int min = 0;
        int max = 0;
        q.add(new info(root, 0)); // pass as obj (pair)
        q.add(null);

        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                // If we encounter null, this indicates the end of a level
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null); // Add level separator for the next level
                    continue; // Skip the rest of the loop
                }
            }
            if (!map.containsKey(curr.horizontal_dis)) { // first time hd is occurring
                map.put(curr.horizontal_dis, curr.node);
            }

            // check left childe & right child
            if (curr.node.left != null) {
                q.add(new info(curr.node.left, curr.horizontal_dis - 1));
                min = Math.min(min, curr.horizontal_dis - 1);
            }
            if (curr.node.right != null) {
                q.add(new info(curr.node.right, curr.horizontal_dis + 1));
                max = Math.max(max, curr.horizontal_dis + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3 };
        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);
        TopView(root);
    }

}
