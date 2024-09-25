//Interleave 2 halve of a Queue (even length)
import java.util.LinkedList;
import java.util.Queue;
public class interlevave2Queue {
    public static void Interleave(Queue<Integer> q){

        Queue<Integer> temp = new LinkedList<>();
        int size = q.size();
        //first harf
        for(int i=0; i<size/2; i++){
            temp.add(q.remove());
        }

        //iteration  for both
        while(!temp.isEmpty()){
            q.add(temp.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        Interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }
}