
public class Doubly {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static int size;
    public static Node tail;

    // addfirst
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;

        // If the list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            // If the list is not empty
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // addlast
    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;

        // If the list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            // If the list is not empty
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // removefast
    public int removefast() {
        if (head == null) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int value = head.data;
        head = head.next;
        head.prev = null; // if single node then error
        size--;
        return value;
    }

    // print
    public void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Doubly dll = new Doubly();

        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.addlast(4);
        dll.print();

        dll.removefast();
        dll.print();
        // System.out.println(dll.size);
    }
}
