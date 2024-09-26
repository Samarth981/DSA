
import java.util.Deque;
import java.util.LinkedList;

public class CreatQueue {
    static class Queues{
        Deque<Integer> dq = new LinkedList<>();
        
        //push
        public void add(int data){
            dq.addLast(data);
        }

        //pop
        public int remove() {
           return dq.removeFirst();
        }

        // peek
        public int peek() {
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("peek value is = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
