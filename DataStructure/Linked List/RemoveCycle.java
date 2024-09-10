public class RemoveCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }

        // find meeting point and reset slow position to head
        slow = head;
        Node prev_fast = null;

        // remove cycle by traversing to meeting point
        while (slow != fast) {
            prev_fast = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // prev_fast is now pointing to the node that connects back to create the cycle
        prev_fast.next = null; // breaking the cycle
    }

    // This checks if a cycle exists in the list
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creates cycle: 1 -> 2 -> 3 -> 2

        System.out.println("Cycle exists before removal: " + isCycle());
        removeCycle();
        System.out.println("Cycle exists after removal: " + isCycle());
    }
}
