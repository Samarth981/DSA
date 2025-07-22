public class Cycile {

    // use slow & fast Algoritum
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node Tail;

    public static boolean IsCycile() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.data == fast.data) {
                return true;
            }
        }
        return false;
    }

    public static void main(String asrgs[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(IsCycile());
    }
}
