
import java.util.*;

public class SortByFreq {

    public static void main(String[] args) {
        String st = "missisippi";

        //step1 : create map (char,freq)
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //step2 : sort char based on freq
        List<Character> arr = new ArrayList<>(map.keySet());
        System.out.println("befor:" + arr);

        arr.sort((ch1, ch2) -> map.get(ch2) - map.get(ch1)); //TimSort 
        System.out.println("after:" + arr);

        //step3 : iteration and build String
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            char ch = arr.get(i);

            int freq = map.get(ch);

            for (int j = 0; j < freq; j++) {
                ans.append(ch);
            }
        }
        String FinalAns = ans.toString();
        System.out.println(FinalAns);
    }
}
