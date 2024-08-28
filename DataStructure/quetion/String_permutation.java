//tc = n*n!
public class String_permutation {
    public static void Parmutation(String str,String new_str){
        //base
        if(str.length() == 0){
            System.out.println(new_str);
            return;
        }
        for(int i=0;i<str.length();i++){ // differnt char in diffrent place

            //currant charr
            char currant = str.charAt(i);
            // "abcd" ==> i = char c ==> str = "ab" + "d"
            String str2 = str.substring(0,i) + str.substring(i+1); //whitout storing chars 
            Parmutation(str2, new_str+currant); //strot char i in new str
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        Parmutation(str, "");
    }
}
