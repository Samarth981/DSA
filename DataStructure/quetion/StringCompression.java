//Amazon
//tc = O(n)
import java.util.*;
class StringCompression{
    public static String compress(String str){
        StringBuilder newstr = new StringBuilder("");

        for(int i=0; i<str.length();i++){
            //count char
            Integer count = 1;
            //check char, how many time char come 
            char ch = str.charAt(i);
            //if i and i+1 same then run loop
            while(i<str.length()-1 && ch == str.charAt(i+1)){
                count++;
                i++; //tc is not n^2 because in the while loop alredy i++  
            }
            newstr.append(ch);
            if(count > 1){
                //count as a string print
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }
    public static int lower(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "aaaabbbcddeee";
        System.out.println(compress(str));
        Scanner st = new Scanner(System.in);
        String user_str = st.next();
        System.out.println("vowels come for: " + lower(user_str));
    }
}