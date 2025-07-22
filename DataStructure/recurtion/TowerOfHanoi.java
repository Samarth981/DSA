public class TowerOfHanoi {
    //n number of discs move a to b help of c program 
    public static void TOH(int n, char a, char b, char c){
        if(n==0){
            return;
        }
        TOH(n-1, a , c, b); //n-1 dis move A to c with help of b
         System.out.println("Move disk " + n + " from " + a + " to " + b); 

        TOH(n-1,c,b,a); //n-1 dis move b to c help of a

    }
    public static void main(String[] args) {
        int n = 3; // number of disks
        char a = 'A'; // source
        char b = 'B'; // to
        char c = 'C'; // aux

        TOH(n, a, b, c);
    
    }
}
