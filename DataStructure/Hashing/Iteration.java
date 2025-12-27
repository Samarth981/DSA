import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 5);
        hm.put("china", 9);
        hm.put("us", 6);
        hm.put("nepal", 7);

        //Iteration
        Set<String> keys = hm.keySet();

        //forEach loop
        for(String k : keys){
            System.out.println("key :" + k + ", value :"+hm.get(k));
        }
    }
}
