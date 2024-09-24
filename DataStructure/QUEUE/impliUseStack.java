//impliment using stack (2 stack are needed)
import java.util.Stack;
public class impliUseStack {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        //add O(n)
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("this is empty ");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("this is empty ");
                return -1;
            }
            return s1.peek();
        }
    }

    static class Queue2{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }
        //add O(n)
        public void add(int data){
            s1.push(data);
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("this is empty ");
                return -1;
            }

            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("this is empty ");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }
    public static void main(String[] args) {
        Queue  q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("////////////////////////");
        Queue2  q1 = new Queue2();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
