//frinds paring poblem
//JB MORGUN
public class frinds_paring{
    public static int paring(int n){
        //base
        if(n==1 || n==2){
            return n;
        }
        int f1 = paring(n-1); //n is single then call n-1
        int f2 = paring(n-2); //(n)(n-1) is pair then call n-2
        int calculate = (n-1) * (n-2);
        int total_pair = (n-1) + calculate;
        return total_pair;
    }
    public static void main(String args[]){
        int n = 3;
        System.out.println(paring(n));
    }
}