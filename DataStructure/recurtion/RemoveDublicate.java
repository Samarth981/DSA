public class RemoveDublicate {
    //remove dublicate in string 

    public static void removeDub(String str, StringBuilder newStr, int index, boolean map[]){
        //base 
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        //work
        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            //dublicte current char so call next index
            removeDub(str, newStr, index+1, map);
        }else{
            map[currChar - 'a'] = true;

            removeDub(str, newStr.append(currChar), index+1, map);
        }
    }


    public static void  main(String args[]){
        String str = "samarth";
        removeDub(str, new StringBuilder(""), 0, new boolean[26]);
    }
}