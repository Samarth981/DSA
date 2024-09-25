//using java collection fremwork

import java.util.Deque;
import java.util.LinkedList;

public class impliment {
    public static void main(String args[]){
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1); //1
        q.addFirst(2); //2 1

        q.addLast(3); //2 1 3
        q.addLast(4); //2 1 3 4
        System.out.println(q);

        q.removeFirst(); //2 is remove
        q.removeLast(); //4 is remoev
        System.out.println(q);
    }
}
