import java.util.Stack;
public class ValideString{
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
       for(int i=0; i<x.length(); i++){
           char ch=x.charAt(i);
           
           if(ch == '(' || ch == '[' || ch == '{'){ //opning
               st.push(ch);
           } else { //closing
               
               if(st.isEmpty()){
                   return false;
               } 
               
               if( (st.peek() == '(' && ch == ')')
                    || (st.peek() == '[' && ch == ']')
                    || (st.peek() == '{' && ch == '}')){
                        
                        st.pop(); //if valide then
                        
                } else {
                    return false;
                }
           }
        }
        //check last if stack not empty
        if(st.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(ispar("(([]))"));
        System.out.println(ispar("({{})"));
    }
}