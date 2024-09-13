
import java.util.ArrayList;
import java.util.LinkedList;

public class  Impliment{
    //stack implimentation in arraylist 
    static class stackArrLi{
        //creat Arraylist
        static ArrayList<Integer> a = new ArrayList<>();

        //isEmpty()
        public static boolean isEmpty() {
        return a.size() == 0;
        } 

        //push
        public static void push(int data){
            a.add(data);
        }

        //pop
        public static int pop(){
            int top = a.get(a.size() - 1);
            a.remove(a.size() - 1);
            return top;
        }

        //peek
        public static int peek(){
            return a.get(a.size() - 1);
        }
    }
    
    
    static class stackLinkList{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        //stack impliment using linklist
        static Node head = null;
        
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }  
    }
    public static void main(String args[]){
        //creat stack
        stackArrLi s = new stackArrLi();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
