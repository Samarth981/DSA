import java.util.LinkedList;
import java.util.Queue;
public class usingFremwork {
    // ArrayDeque:

    // Add/Remove at the front or end: O(1) (amortized, because computer-memory reallocating takes an order of O(n)).

    // Access by index: because it does not implement RandomAccess.

    // Memory Usage: It is more effective with small collection as memory can be used contiguously.

    // LinkedList:

    // Add/Remove at the front or end: O(1) since this is a doubly-linked list.

    // Access by index: O(n) since you have to traverse the list either from the head or the tail.

    // Memory Usage: More memory is consumed due to node pointers (next and previous references).
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
