

public class Binary{
    public static void Odd_Even(int num){
        int bitMask = 1;
        if((num & bitMask) == 0) {
            System.out.println("number " + num + " is even");
        }else{
            System.out.println("number " + num + " is odd");
        }
    }
    //find ith posssion (Get operation)
    public static int gat(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    //change the ith index like if 0 then convert in 1 (set)
    public static int set(int num , int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }

    //change the ith index clear like 0 (clear)
    public static int clear(int num , int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }

    //update ith bit 
    public static int  updateIthBit(int num, int i, int newBit){
        //first approch
        // if(newBit == 0){
        //     return clear(num, i);
        // }else(
        //     return set(num, i);
        // )

        //secound approch
        int n = clear(num, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static boolean pover(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        Odd_Even(2);
        Odd_Even(9);
        System.out.println(gat(10, 3));
        System.out.println(set(10, 2));
        System.out.println(clear(10, 1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(pover(8));
    }
}