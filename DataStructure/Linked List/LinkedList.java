
//TC of addfirst or addLast = O(1)
public class LinkedList{
    
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

    //method1 - addFirst
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

    // method2 - addLast
    public void addLast(int data){

        //step1 - creat new node
        Node newNode2 = new Node(data);

        //spacecial case
        if(head == null){
            head = Tail = newNode2;
            return;
        }

        //step2 - node2 next font newnode2
        Tail.next = newNode2;

        //step3 - newnode is a taile
        Tail = newNode2;
    }
    
    public static void main(String args[]){
        //creeat a object of a main class
        LinkedList obj = new LinkedList();
        obj.addFirst(1);
        obj.addFirst(2);
        obj.addLast(3);
        obj.addLast(4);
    }
}

//dray run

// first= 2 //head
//secund = 1
//thierd = 3
//four = 4; //tail
// 2 --> 1 --> 3 --> 4 --> null


//exmple -2
//bj.addFirst(1);
// obj.addFirst(2);
// obj.addLast(3);
// obj.addLast(4);

//ans
// 1 --> 2 --> 3 --> 4 --> null