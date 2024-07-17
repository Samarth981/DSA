import java.util.*;

public class loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // while loop
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        //print rever of number
        int p = 10889;
        while(p >0){
            int lastDigit = p % 10;
            System.out.print(lastDigit);
            p = p/10;
        }

        //prim number
        int x = sc.nextInt();
        boolean isPrime = true;
        for(int y=2 ; /*y<=x-1 */ y<=Math.sqrt(x) ; y++){
            if(x%y == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("this number is prime");
        }else{
            System.out.println("this number is not prime");

        }
    }
}