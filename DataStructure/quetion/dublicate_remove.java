public class dublicate_remove{
    public static void remove(String str, int index, StringBuilder newstr, boolean mep[]){
        //base
        if(str.length() == index){
            System.out.println(newstr);
            return;
        }
        //work
        char currant = str.charAt(index);
        if(mep[currant- 'a'] == true){
            //dublicate
            remove(str, index+1, newstr, mep);
        }else{
            mep[currant-'a'] = true; //assin true if not come like arr[i] == 0
            remove(str, index+1, newstr.append(currant), mep);
        }
    }
    public static void main(String[] args) {
        String str = "sasmaarmth";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}