// key is give and remove key. but count start frome end 
//TC - O(n)
public class removeFromEnd {
    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;


    public static int size(){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    //remeove -> TC - O(n)
    public void removeNfromEnd(int n){
        int size = size();
        
        //if only one node 
        if(n == size){
            head = head.next;
        }

        //other case start head to prev
        int stop_loop = size-n;
        Node prev = head;
        int i=1;

        //go to the prev index
        while(i < stop_loop){
            prev = prev.next;
            i++;
        }
        
        //after come prev index
        prev.next = prev.next.next;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public static void print(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> "); //print
            temp = temp.next; //next node is temp
        }
        System.out.println("null");
    }
    public static void main(String args[]){

        removeFromEnd obj = new removeFromEnd();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        print();
        obj.removeNfromEnd(3);
        print();
    }
}
