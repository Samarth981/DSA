//stack impliment using Deque
import java.util.Deque;
import java.util.LinkedList;

public class CreatStack {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        //push
        public void push(int data){
            dq.addLast(data);
        }

        //pop
        public int pop() {
           return dq.removeLast();
        }

        // peek
        public int peek() {
            return dq.getLast();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack(); //stack class obj
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
