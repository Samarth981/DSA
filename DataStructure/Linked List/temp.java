// this code is same assignment Q3 like M and N 


public class temp{
     public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
     }

     public static Node head;
     public static Node Tail;

     public static void check(Node head, int m, int n){
        int tempM = m;
        int tempN = n;
        Node curr = head;
        Node prev = null;
        Node last_Stop = null;
         if (curr == null) return;
        while(curr!=null && n>0){
            while(tempM > 0 && curr!=null){
                prev = curr;
                curr = curr.next;
                tempM--;
            }
            last_Stop = prev;
            while(tempN > 0 && curr!=null){
                prev = curr;
                curr = curr.next;
                tempN--;
            }
           if (last_Stop != null) {
                last_Stop.next = curr;
            } else {
                head = curr; // if we started deletion from beginning
            }
            // Reset counters
            tempM = m;
            tempN = n;
        }
        
    }
     public static void print() {
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

     public static void main(String args[]){
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
       
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        head = a1;
        Tail = a4;

        check(head, 2,3);
        print();
     }

}
   
