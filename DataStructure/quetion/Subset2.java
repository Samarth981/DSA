//recurtion (2^n) + Backtracing
public class Subset2 {
    public static void Subset(String str,String new_str,int i){
        //base
        if(i == str.length()){
            System.out.println(new_str);
            return;
        }
        //work
        //if yes
        Subset(str, new_str + str.charAt(i) ,i+1);
        //if no
        Subset(str,new_str,i+1);
    }
    public static void main(String args[]) {
        String str = "245";
        Subset(str, "", 0);
    }
}
