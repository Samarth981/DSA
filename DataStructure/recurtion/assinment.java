public class assinment{

//Q-5 Taver of Hanoi
//print step to move n number of disk frome using A  to C 
public static void taverOfHanoi(int n, char A , char C, char B){     //A(currnt),B(helper),C(destination) is a road
    //base
    if(n == 0){
        return; 
    }
    //first work recirtion
    taverOfHanoi(n-1, A, B, C);       // A -> B using C(helper)

    System.out.println("moving disc " + n + " from " + A + " to " + C);

    taverOfHanoi(n-1, B, C, A);       // B->C using A(helper)

    }

    //Q-2

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigits(int number){                                                                                     
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printdigits(number/10); //recursion
        System.out.print(digits[lastDigit] + " ");
    }

    //Q-3
    public static int length(String str){
        
        //base
        if(str.length() == 0){
            return 0;
        }
        int total_length = length(str.substring(1))+1;
        return total_length;
    }

    //Q-4
    public static int subCount(String str,int i, int j, int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res1 = subCount(str, i+1, j, n-1);
        if(str.charAt(i) == str.charAt(j)){
            res1++;
        }
        int res2 = subCount(str, i+1, j, n-1);
        if(str.charAt(i) == str.charAt(j)){
            res2++;
        }
        // int res3 = subCount(str, i+1, j-1, n-2);
        // if(str.charAt(i) == str.charAt(j)){
        //     res3++;
        // }
        int res = res1+res2;
        return res;
    }

    public static void main(String args[]){
        int n;
        taverOfHanoi(3, 'A', 'C', 'B');
        printdigits(1235);

        //Q-3
        String str = "lflkjlksf";
        System.out.println(length(str));

        //Q-4
        String str1 = "abcab";
        int l = str1.length();
        System.out.println(subCount(str1, 0, l-1, l));
    }
    
}


