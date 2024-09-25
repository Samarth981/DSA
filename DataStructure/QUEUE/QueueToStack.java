
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueToStack {
    static class stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){
               q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int  pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;

            if(!q1.isEmpty()){ //case 1 = q1
                while(!q1.isEmpty()){
                    top = q1.remove(); //last eliment
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top); //other eliment store in q2
                } 
            } else {     //case 2 = q2
                while(!q2.isEmpty()){
                    top = q2.remove(); //last eliment
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }   
            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = -1;

            if(!q1.isEmpty()){ //case 1 = q1
                while(!q1.isEmpty()){
                    top = q1.remove(); //last eliment
                    q2.add(top); //other eliment store in q2
                } 
            } else {     //case 2 = q2
                while(!q2.isEmpty()){
                    top = q2.remove(); //last eliment
                    q1.add(top);
                }   
            }
            return top;
        }
    }
    public static void main(String[] args) {
        Stack  s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
