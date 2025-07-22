public class ZigZag {
    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null; // first time
        }
    }

    public static Node head;
    public static Node Tail;

    public void addFirst(int data) {

        // step1 = creat a new node
        Node newNode = new Node(data);
        // spacecial case
        if (head == null) {
            head = Tail = newNode;
            return;
        }

        // step2 = Link newnode next to a head
        newNode.next = head;

        // step3 = newnode is a head
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("linked list is empty");
        }
        Node temp = head; // creat a node
        while (temp != null) {
            System.out.print(temp.data + " --> "); // print
            temp = temp.next; // next node is temp
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigzag() {
        // find mid
        Node mid = getMid(head);

        // revers right part
        Node currnt_right = mid.next;
        mid.next = null; // break left and right

        Node prev = null;
        Node next;
        while (currnt_right != null) {
            next = currnt_right.next;
            currnt_right.next = prev;

            prev = currnt_right;
            currnt_right = next;
        }

        // merge
        Node left = head;
        Node right = prev; // after revers prve is a mid+1 //do not use mid.next because after revers
                           // mid.next = null
        Node nextL;
        Node nextR;
        while (left != null && right != null) {
            nextL = left.next; // 1
            left.next = right; // connect 0 and 5
            nextR = right.next; // 4
            right.next = nextL; // connect 4 and 1

            // update
            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        ZigZag obj = new ZigZag();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addFirst(4);
        obj.addFirst(5);
        obj.print();
        obj.zigzag();
        obj.print();
    }
}
