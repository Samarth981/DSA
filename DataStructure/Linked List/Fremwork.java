import java.util.LinkedList;
public class Fremwork {
    
    public static void main(String args[]){
        //create
        LinkedList<Integer> ll = new LinkedList<>();  //same ArrayList type

        //add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // 5 - 4 - 3 - 2 - 1 

        //print
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        
    }
}
