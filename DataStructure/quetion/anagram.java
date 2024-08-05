import java.util.*;

// determin 2 string is anagram or not
//anagram = latter is same for both string. it is not depend on order
//tc = O(nlogn)

public class anagram{
    public static void main(String args[]){
        String str = "cbada";
        String str1 =  "bcaad";

        str1 = str1.toLowerCase(); //nlogn
        str = str.toLowerCase();

        if(str1.length() == str.length()){
            char[] str1ChArray = str.toCharArray();
            char[] str2ChArray = str1.toCharArray();

            Arrays.sort(str1ChArray);
            Arrays.sort(str2ChArray);

            boolean result = Arrays.equals(str1ChArray, str2ChArray);

            if(result){
                System.out.println(str + " and " + str1+ " are equal");
            }else{
                System.out.println(str + " and " + str1+ " are not equal");
            }
        } else {
            System.out.println("both are not equal");
        }
    }
}