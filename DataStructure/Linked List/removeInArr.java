//arr is given remove arr aliment into the node 

public class removeInArr {
    
    // Binary Search Method
    public static boolean search(int key , int number[]){
        int start = 0;
        int end = number.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(number[mid] == key){
                return true;
            }
            if(number[mid] < key){ // search in the right half
                start = mid + 1;
            } else { // search in the left half
                end = mid - 1;
            }
        }
        return false;
    }

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // Method to remove nodes if their data exists in the num array
    public static Node checkRemove(int num[], Node head) {
        // Base case
        if(head == null) {
            return null;
        }

        Node temp = head;
        Node prev = null; // To track the previous node

        while(temp != null) {
            if(search(temp.data, num)) {
                // If node needs to be deleted
                if(prev == null) {
                    // Deleting head node
                    head = temp.next;
                } else {
                    // Deleting middle node
                    prev.next = temp.next;
                }
                size--; // Decrease the size after removal
            } else {
                prev = temp; // Move the previous pointer forward
            }
            temp = temp.next; // Move to the next node
        }

        return head;
    }

    public void print() {
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        // Create a new node
        Node newNode = new Node(data);
        size++;

        // Special case: when list is empty
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // Link new node to the current head
        newNode.next = head;

        // Update head to be the new node
        head = newNode;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3}; // Corrected array initialization

        // Create an object of the main class
        removeInArr obj = new removeInArr();

        // Add elements to the linked list
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addFirst(4);
        obj.addFirst(5);

        // Remove nodes whose data matches elements in num
        head = checkRemove(num, head);

        // Print the linked list after removal
        obj.print();
    }
}
