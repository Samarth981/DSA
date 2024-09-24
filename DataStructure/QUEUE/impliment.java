public class impliment {
    //impliment through arr

    static class Arrays{
        static int arr[];
        static int size;
        static int rear;
        Arrays(int n){
            size = n;
            arr = new int[size];
            rear = -1;
        }

        //isEmpty //O(1)
        public static boolean isEmpty(){
            return rear == -1;
        }

        //add //O(1)
        public static void add(int data){ //rear is move, front is fixed
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear  = rear +1;
            arr[rear] = data;
        }

        //remove //O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){  
                arr[i] = arr[i+1]; //all eliment is sift one 
            }
            rear = rear -1;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    //implimeent throue link list -> simple > remove = in front , add = in last, peek = head.data;
    // O(1)
    static class linkLists{  
        class Node {
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        Node head = null;
        Node tail = null;

        //isEmpty
        public boolean isEmpty(){
            return head == null && tail == null;
        }

        //add 
        public void add(int data){ 
           Node newNode = new Node(data);
           if(head == null){
                head = tail = newNode;
                return;
           }
           tail.next = newNode;
           tail = newNode;
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){ //single eliment
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Arrays q = new Arrays(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        linkLists l = new linkLists(); 
        l.add(20);
        l.add(21);
        l.add(22);
        l.add(23);
        l.add(24);
        
        while(!l.isEmpty()){
            System.out.println(l.peek());
            l.remove();
        }
    }
}
