
import java.util.*;

public class ItineraryTickets {

    public static String startPoint(HashMap<String, String> tickets) {
        HashMap<String, String> ReversMap = new HashMap<>();

        for (String key : tickets.keySet()) { //O(n)
            ReversMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!ReversMap.containsKey(key)) {
                return key;
            }
        }
        return null;

    }

    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", "Goa");

        //step1 : find starting point
        String start = startPoint(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("-> " + tickets.get(start));
            start = tickets.get(start);
        }
    }
}
