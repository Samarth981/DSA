
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
    public static int  size;

    //method1 - addFirst
    public void addFirst(int data){

        //step1 = creat a new node
        Node newNode = new Node(data);
        size++;
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

        //step1 - creat new node object
        Node newNode2 = new Node(data);
        size++;
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

    //method3 - add in midel index
    public void addMid(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode3 = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1 -> previous node
        newNode3.next = temp.next;
        temp.next = newNode3;
    }

    //method4 - remove first
    public int removeFirst(){
        if(size == 0){
            System.out.print("list is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = Tail = null;
            size = 0;
            return val;
        }
        int val = head.data; //delete data of head
        head = head.next; 
        size--;
        return val;
    }

    //method5 - remove last
    public int removeLast(){

        if(size == 0){
            System.out.print("list is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = Tail = null;
            size = 0;
            return val;
        }
        //preve : i = size-2;
        //last : i-1;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val =Tail.data; //tail data
        prev.next = null;
        Tail = prev;
        size--;
        return val;
    }
    
    //method6 - print link list
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
    public static void main(String args[]){
        //creeat a object of a main class
        LinkedList obj = new LinkedList();

        obj.print();
        obj.addFirst(1);
        obj.print();
        obj.addFirst(2);
        obj.print();

        obj.addLast(3);
        obj.print();
        obj.addLast(4);
        obj.print();
        obj.addLast(5);
        obj.print();

        obj.addMid(2, 10);
        obj.print();

        obj.removeFirst(); //remove for value 2
        obj.print();

        obj.removeLast(); //remove for value 5
        obj.print();
        System.out.println(size);
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