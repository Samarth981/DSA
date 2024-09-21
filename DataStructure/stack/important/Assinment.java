
import java.util.Stack;

public class Assinment {

    // Q-1
    static class Node{
        char data;
        Node next;
        Node(char  data){
            this.data = data;
            this.next = null;   
        }
    }
    public static boolean check(Node head){
        Node slow = head;
        boolean IsPalindrom = true;

        Stack<Character> st = new Stack<>();
        while(slow != null){
            st.push(slow.data);
            slow = slow.next;
        }

        while(head!=null){
            char i = st.pop();
            if(head.data == i){
                IsPalindrom = true;
            }else{
                IsPalindrom = false;
                break;
            }
            head = head.next;
        }
        return IsPalindrom;
    }

    //Q-2
    // it is possible to solve this problem with reduced time and space complexity 
    // by using a deque (double-ended queue) for efficient operations. 
    // This approach can help in minimizing both time and space usage compared to the stack-based or character array-based methods.

    static class Solution {
        public static String simplifyPath(String path) {
            // Create an array of split components
            String arr[] = path.split("/");
    
            Stack<String> st = new Stack<>();
            // Store useful elements
            for (int i = 0; i < arr.length; i++) {
                String curr = arr[i];
    
                // Condition check
                if (curr.equals("..") && !st.isEmpty()) {
                    st.pop();
                } else if (!curr.equals("..") && !curr.equals(" ") && !curr.equals("") && !curr.equals(".")) {
                    st.push(curr);
                }
            }
    
            // If stack is empty, return "/"
            if (st.isEmpty()) {
                return "/";
            }
    
            // Reverse the stack to build the path
            Stack<String> revers = new Stack<>();
            while (!st.isEmpty()) {
                revers.push(st.pop());
            }
    
            // Stack elements stored into ans string
            StringBuilder ans = new StringBuilder();
            while (!revers.isEmpty()) {
                ans.append("/");
                ans.append(revers.pop());
            }
    
            return ans.toString();
        }
    }
    
    //Q-3
    public static String decodeString(String s) {
        Stack<Character> st = new Stack<>(); 

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ']'){
                st.push(ch);
            }else{
                //retrive string after '['
                StringBuilder sb = new StringBuilder();
                
                while(!st.isEmpty() && st.peek()!= '['){
                    sb.insert(0,st.pop()); //store in 0 index
                }
                String toRepeat = sb.toString(); 
                st.pop(); //remove '[' 

                //retrive digit before '['
                sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()>='0' && st.peek()<='9'){
                    sb.insert(0,st.pop());
                }

                int count = Integer.parseInt(sb.toString());

                //push string "repeting" time
                while(count > 0){
                    // for(int i=0; i<toRepeat.length(); i++){
                    //     st.push(toRepeat.charAt(i));
                    // }
                    for(char c : toRepeat.toCharArray()){
                        st.push(c);
                    }
                    count--;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(st.size()>0){
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
    

    public static void main(String args[]){
        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('B');
        Node five = new Node('A');

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        boolean ans = check(one);
        System.out.println(ans);
        
        Solution sol = new Solution();
        System.out.println(sol.simplifyPath( "/a/."));

        System.out.println(decodeString("3[a]2[bc]"));
    }
}
