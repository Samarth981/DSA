
import java.util.*;


public class reversK {
    public static void reverseFirstK(Queue<Integer> q, int k){
        if(q == null || k>q.size()){
            return;
        }
        Stack<Integer> s= new Stack<>();
        for(int i=0; i<k; i++){
            s.add(q.peek());
            q.remove();
        }
        while(!s.isEmpty()){
            q.add(s.peek());
            s.pop();
        }
        for(int i=0; i<q.size()-k; i++ ){
            q.add(q.peek());
            q.remove();
        }
    }
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        reverseFirstK(queue, k);

        // Print the modified queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
