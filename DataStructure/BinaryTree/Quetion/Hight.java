public class Hight {
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

        public static int Hight(Node root) {
            if (root == null) {
                return 0;
            }

            int left_hight = Hight(root.left);
            int right_hight = Hight(root.right);
            int hight = Math.max(left_hight, right_hight) + 1;
            return hight;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }

            int left_count = count(root.left);
            int right_count = count(root.right);
            int count = left_count + right_count + 1;
            return count;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int left_sum = sum(root.left);
            int right_sum = sum(root.right);
            int sum = left_sum + right_sum + root.data;
            return sum;
        }

        // Approache - 1
        public static int diameter(Node root) { // O(n^2)
            if (root == null) {
                return 0;
            }

            int leftDiam = diameter(root.left);
            int leftHight = Hight(root.left);

            int rightDiam = diameter(root.right);
            int rightHight = Hight(root.right);

            int selftDiam = leftHight + rightDiam + 1;

            return Math.max(selftDiam, Math.max(leftDiam, rightDiam));
        }

        // Approache - 2
        static class Info {
            int diameter;
            int hight;

            public Info(int diameter, int hight) {
                this.diameter = diameter;
                this.hight = hight;
            }
        }

        public static Info diameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            // through this both info find diam and hight
            int diameters = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),
                    leftInfo.hight + rightInfo.hight + 1);
            int hight = Math.max(leftInfo.hight, rightInfo.hight) + 1;

            return new Info(diameters, hight); // return obj
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3 };

        BuildTree tree = new BuildTree();
        Node root = tree.build(nodes);
        System.out.println(tree.Hight(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));

        System.out.println(tree.diameter(root));

        System.out.println("...................");
        System.out.println(tree.diameter2(root).diameter);
        System.out.println(tree.diameter2(root).hight);
    }
}
