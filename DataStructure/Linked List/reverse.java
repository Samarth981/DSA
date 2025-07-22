public class reverse {
    public static class Node {

        int data;
        Node next;

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
        Node currnt = tail = head;
        Node next;
        while (currnt != null) {
            next = currnt.next;
            currnt.next = prev;

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
        if (head == null) {
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> "); // print
            temp = temp.next; // next node is temp
        }
        System.out.println("null");
    }

    public static void main(String args[]) {

        reverse obj = new reverse();
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

// explanetion

// 1(prev) -> 2(curr) -> 3 (next) (next = curr.next)
// 1(prev) <-2(curr) <- 3(next) (curr.next = prev)