import java.util.*;
public class LoopQuetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SumOfEven = 0;
        int  SumOfOdd = 0;
        int choice;
        do {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if(number%2 == 0){
                SumOfEven = SumOfEven + number;
            } else{
                SumOfOdd = SumOfOdd + number;
            }
            System.out.println("if you want to continue? press 1 for yes and 0 for no");
            choice = sc.nextInt();                                                                                                                                                                                                                                          
        }while(choice == 1);
            System.out.println("sum of even number : " + SumOfEven);
            System.out.println("sum of odd number : " + SumOfOdd);

            //fectorial
            int a = sc.nextInt();
            int fact = 1;
            for(int i=1; i<=a; i++){
                fact = fact*i;
            }
            System.out.println(fact);

            // muliplication table
            int muli;
            for(int i=1 ; i<=10; i++){
                muli = a*i;
                System.out.println(a + "*" + i + "=" + muli);
            }
            
    }
}
