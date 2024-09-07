public class Searchkey{

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

    //searching method -> TC - O(n)
    public int Search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            //if not found
            temp = temp.next;
            i++;
        }
        return -1;
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

        Searchkey obj = new Searchkey();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        print();
        int key = 3;
        System.out.println(obj.Search(key));
    }

}