import java.util.LinkedList;
import java.util.Queue;

public class decToBins {

    //Generate Binary numbers
    public static void desToBin(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek(); //peek one 
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0"); //even
            q.add(s2 + "1"); //odd
        }
    }
    public static void main(String[] args) {
        int n = 10;
        desToBin(n);
    }
    
    
}
