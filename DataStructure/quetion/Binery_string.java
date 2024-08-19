public class Binery_string {
    public static void str(int n, int choice_currnt, StringBuilder newstr ){
        //base
        if(n==0){
            System.out.println(newstr);
            return;
        }
        if(choice_currnt == 0){ // n choice
            str(n-1, 0, newstr.append("0")); //n-1 choice
            str(n-1, 1, newstr.append("1"));
        } else {
            str(n-1,0, newstr.append("0")); 
            //if first(n) is 1 then after that come 0 only
        }

        //sort write uper code
        // str(n-1, 0, newstr+"0"); //comman part 
        // if(choice_currnt==0){
        //     str(n-1,1, newstr+"1"); 
        // }
    }
    public static void main(String args[]){
        str(3, 0, new StringBuilder(""));
        // str(3, 0, new String(""));
    }
}
