import java.util.*;
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
    
    
}
