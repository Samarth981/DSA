import java.util.Stack;
public class StringRevers {
    public static void reversStr(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }
    }
    public static void main(String args[]){
        //creat stack
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
