//print nums form n to 1 (decreasing order)
public class NumsPrint{
    //creat function
    public static void printDec(int n){
        //base
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print("1 ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int  fact(int n){  //tc = O(n) , sp = O(n)
        if(n==0){
            return 1;
        }
        // int fact1 = fact(n-1);
        // int fn = n * fact1;
        // return fn;
        return n*fact(n-1); 
    }

    public static int  sum(int n){  //tc = O(n) , sp = O(n)
        if(n==0){
            return 0;
        }
        // int sum1 = sum(n-1);
        // int sum = n + sum1;
        // return sum;
        return n+sum(n-1);
    }

    public static int fibonaci(int n){
        if(n==1 || n==0){
            return n;
        }
        // int fb1 = fibonaci(n-1);
        // int fb2 = fibonaci(n-2);
        // int fb = fb1 + fb2;
        // return fb;
        return fibonaci(n-1) + fibonaci(n-2);
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
        printInc(n);
        System.out.println(fact(4)); 
        System.out.println(sum(5)); 
        System.out.println(fibonaci(5));
        
    }
}

