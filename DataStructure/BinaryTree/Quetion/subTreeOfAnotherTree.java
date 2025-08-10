public class subTreeOfAnotherTree {
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

        public static Node build(int nodes[], int[] index) {
            if (index[0] >= nodes.length || nodes[index[0]] == -1) {
                index[0]++;
                return null;
            }

            Node newNode = new Node(nodes[index[0]]);
            index[0]++;
            newNode.left = build(nodes, index);
            newNode.right = build(nodes, index);
            return newNode;
        }

        //MachNode  =  Those node is a actual tree node where data is match for subtree root. 
        public static boolean isIdentical(Node MachNode, Node subRoot) {
            if (MachNode == null && subRoot == null) { //both null then isIdentical
                return true;
            } else if (MachNode == null || subRoot == null || MachNode.data != subRoot.data) { //if both are not null 
                return false;
            }

            return isIdentical(MachNode.left, subRoot.left) && isIdentical(MachNode.right, subRoot.right);
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }

            if (root.data == subRoot.data && isIdentical(root, subRoot)) {
                return true;
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 }; // Main Tree
        // int subNode[] = { 2, 4, -1, -1, 5, -1, -1, }; // Corrected Subtree

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 }; // Main Tree
        int subNode[] = { 2, 4, -1, -1, 6, -1, -1 }; // Subtree (incorrect)

        // This approach allows you to maintain independent index tracking for
        // multiple tree constructions. The index is passed explicitly, which can help
        // avoid issues with concurrent builds.
        int[] mainIndex = { 0 };
        int[] subIndex = { 0 };

        Node root = BuildTree.build(nodes, mainIndex);
        Node subRoot = BuildTree.build(subNode, subIndex);

        System.out.println(BuildTree.isSubtree(root, subRoot)); // Output: true or false
    }
}

// If you are building a single tree and want a simple solution, using a static
// variable is acceptable. //idex = -1 method
// If you plan to build multiple trees or want a more reusable and flexible
// approach, using an integer array is preferable. //new method