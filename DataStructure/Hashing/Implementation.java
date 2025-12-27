import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 200);

        // Print
        System.out.println(hm);

        //get
        int rank = hm.get("India");
        System.out.println(rank);

        //containsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("US"));

        //remove
        System.out.println(hm.remove("China"));

        //Size
        System.out.println(hm.size());
        //isEmpty
        System.out.println(hm.isEmpty());

        //clear 
        hm.clear();
    }
}
