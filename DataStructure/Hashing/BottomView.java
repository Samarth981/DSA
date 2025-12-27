
import java.util.*;

public class BottomView {

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

    static class Pair {

        Node nod;
        int x;

        public Pair(Node nod, int x) {
            this.nod = nod;
            this.x = x;
        }

    }

    public static ArrayList<Integer> BottomViewOfTree(Node root) {

        Queue<Pair> q = new LinkedList<>();

        Pair p = new Pair(root, 0);
        q.add(p);
        // (x,value)
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (!q.isEmpty()) {
            Node currNode = q.element().nod;
            int x = q.element().x;

            q.remove();
            map.put(x, currNode.data);

            if (currNode.left != null) {
                Pair p1 = new Pair(currNode.left, x - 1);
                q.add(p1);
            }
            if (currNode.right != null) {
                Pair p1 = new Pair(currNode.right, x + 1);
                q.add(p1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer value : map.values()) {
            ans.add(value);
        }
        return ans;
    }

    public static void main(String[] args) {
        int num[] = {10, 20, -1, -1, 30, 40, -1, -1, 50, -1, -1};

        Node root = buildBinaryTree(num);
        ArrayList<Integer> ans = BottomViewOfTree(root);
        System.out.println(ans);
    }
}
