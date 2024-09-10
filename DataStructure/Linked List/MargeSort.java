public class MargeSort {
    public static class Node{
        int data;
        Node next;
        //constructor 
        public Node(int data){
            this.data = data;
            this.next = null;  //first time 
        }
    }

    public static Node head;
    public static Node Tail;

    public void addFirst(int data){

        //step1 = creat a new node
        Node newNode = new Node(data);
        //spacecial case
        if(head == null){
            head = Tail = newNode;
            return;
        }

        //step2 = Link newnode next to a head
        newNode.next = head;

        //step3 = newnode is a head
        head = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp = head;  //creat a node
        while(temp != null){
            System.out.print(temp.data + " --> "); //print
            temp = temp.next; //next node is temp
        }
        System.out.println("null");
    }
    
    //this function i use only this class so private 
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node left, Node right){
        Node mergeAll = new Node(-1);
        Node temp = mergeAll;
        while(left!= null && right!= null){
            if(left.data <= right.data){
                temp.next = left;
                //updat
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                //updat
                right = right.next;
                temp = temp.next;
            }
        }
        while(left != null){
            temp.next = left;
            //updat
            left = left.next;
            temp = temp.next;
        }
        while(right != null){
            temp.next = right;
            //updat
            right = right.next;
            temp = temp.next;
        }
        return mergeAll.next;
    }
    public Node mergeSort(Node head){
        // base
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left & right MergeSort

        //break the list
        Node rightHarf = mid.next;
        mid.next = null;
        //calling
        Node leftSorted = mergeSort(head);    
        Node rightSorted = mergeSort(rightHarf); 
        
        //merge
        return merge(leftSorted, rightSorted);
    }

    
    public static void main(String[] args) {
        MargeSort obj = new MargeSort();
        obj.addFirst(1);
        obj.addFirst(5);
        obj.addFirst(3);
        obj.addFirst(7);
        obj.addFirst(2);
        obj.print();
        obj.head = obj.mergeSort(obj.head);
        obj.print();
    }
}
