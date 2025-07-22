public class reversDLL {
    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    // revers -> TC - O(n)
    public void revers() {
        Node prev = null;
        Node currnt = head;
        Node next;
        while (currnt != null) {
            next = currnt.next;
            currnt.next = prev;
            currnt.prev = next; // line add only
            // after revers currnt move
            prev = currnt;
            currnt = next;
        }
        // --> prev -> null
        head = prev;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        reversDLL obj = new reversDLL();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        print();
        obj.revers();
        print();
    }

}
