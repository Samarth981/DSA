//print revers val in linked List without revers linked List

//In this approach we can use recursion and print using backtracking 

public class ReversValPrint {
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

     public static void PrintVal(Node p){
        if(p != null){
            PrintVal(p.next);
            System.out.println(p.data);
        }
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

        PrintVal(head);
     }

}
