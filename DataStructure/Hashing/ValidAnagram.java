
import java.util.*;

public class ValidAnagram {

    public static boolean validAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "race"; //O(n), n= length of string 
        String str2 = "care";

        String str3 = "tulip";
        String str4 = "lipid";

        System.out.println(validAnagram(str1, str2));
        System.out.println(validAnagram(str3, str4));

    }

}
