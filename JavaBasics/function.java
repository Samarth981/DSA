
import java.util.Scanner;


public class function {
    public static void PrintHello(){
        System.out.println("hello world");
    }
    public static void calculate(int num1 , int num2){
        int c = num1 + num2;
        System.out.println(c);
    }
    //1
    public static void swap(int a, int b){
        int temp = a; 
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" +b);
    }
    //2
    public static void swap2(int a, int b){
        int temp = a; 
        a = b;
        b = temp;
    }

    public static int product(int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int a){
        int fact = 1;
        if(a>=0){
            for(int i=1;i<=a;i++){
                fact = fact*i;
            }
        } else{
            System.out.println("not possible");
        }
        return fact;
    }
    public static int Binomial_Coefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCof = fact_n / (fact_r*fact_nmr);
        return  binCof;
    }
    
    //function overloading
    public static int sum(int num1 , int num2){
        int num = num1 + num2;
        return  num;
    }
    public static int sum(int num1 , int num2, int num3){
        int num = num1 + num2 + num3;
        return  num;
    }
    public static float sum(float num1 , float num2, float num3){
        float num = num1 + num2 + num3;
        return  num;
    }

    public static boolean  isprime(int a){
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean   PrimeinRange(int a){
        for(int i=2; i<=Math.sqrt(a); i++){
    }







    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PrintHello();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate(a,b);
        
        swap(a ,b);
       
        swap2(a,b); //swap2 is not work because "change value" concept
        System.out.println("a =" + a);
        System.out.println("b =" +b);

        int mul = product(10, 20);
        System.out.println(mul);

        int fact = factorial(5);
        System.out.println(fact);

        System.out.println(Binomial_Coefficient(5, 2));

        System.out.println(sum(5, 5, 10));

        System.out.println(isprime(5));
    }
}
