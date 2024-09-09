public class remove_cycile {
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

    public static void remove(){
        //deteck cyclie 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeating point and change slow possion
        slow = head;
        Node prev_fast = null;
        //remove cycle -> prev.next = null
        while(slow != fast){
            prev_fast = fast;
            slow = slow.next; //+1
            fast = fast.next; //+1
        }
    }
    
    //This is not a code part only check output cycle is exist or not
    public static boolean IsCycile(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.data == fast.data){
                return true;
            }
        }
        return false;
    }

    public static void main(String asrgs[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1-2-3-2
        IsCycile();
        remove();
        IsCycile();
    }
}
