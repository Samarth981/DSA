
import java.util.Stack;

public class Dublicate {
    public static boolean checkIsDublicate(String s) { // O(n)
        Stack<Character> sc = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == ')' || curr == ']' || curr == '}') {
                int count = 0;
                while (!sc.isEmpty() && (sc.peek() != '(' && sc.peek() != '[' && sc.peek() != '{')) {
                    sc.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // dublicate exist
                } else {
                    sc.pop(); // opening brekate is remove and check nest.
                }
            } else {
                sc.push(curr); // opening codition
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "((a+b))"; // true
        String s2 = "(a-b)"; // false
        System.out.println(checkIsDublicate(s));
        System.out.println(checkIsDublicate(s2));
    }
}
