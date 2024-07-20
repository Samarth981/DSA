
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
    public static void PrimeinRange(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void bintoDec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit* (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + mynum + "= " + decNum);
    }

    public static void dectoBin(int n){
        int mynum = n;
        int pow = 0;
        int binNum = 0;
    
        while(n>0){
            int remander = n%2;
            binNum = binNum + (remander* (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary of " + mynum + "= " + binNum);
    }

    public static int reversNum(int n){
        int newNum = 0;
        while(n>0){
            int remander = n%10;
            newNum = newNum*10+remander;
            n = n/10;   
        }
        return newNum;
    }
    public static void  palandromNum(int n){
        int revers = reversNum(n);
        if(n == revers){
            System.out.println("this number is plandrome");
        }else if(n==0){
            System.out.println("this number is plandrome");
        }else{
            System.out.println("this number is not plandrome");
        }
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

        System.out.println(isprime(100));

       PrimeinRange(10);

       bintoDec(1010100);

       dectoBin(5);
       palandromNum(1341);
    }
}
