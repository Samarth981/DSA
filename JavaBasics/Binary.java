

public class Binary{
    public static void Odd_Even(int num){
        int bitMask = 1;
        if((num & bitMask) == 0) {
            System.out.println("number " + num + " is even");
        }else{
            System.out.println("number " + num + " is odd");
        }
    }

    // find  unique number
    public static int unique(int num[]){
        int start_unique = 0;
        for(int i=0;i<=num.length-1;i++){
            start_unique =  start_unique^num[i];
        }
        return  start_unique;  
    }
    //find ith posssion bit (Get operation)
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
        int bitMask = newBit<<i;// newbit comes for ith possition 
        return n|bitMask;
    }
    public static boolean pover(int n){
        return (n&(n-1)) == 0;
    }

    //calculate set bit
    public static int calculate(int n){
        int count = 0;
        while(n>0){

            //find last number(lsb)
            if((n&1) != 0){
                count++;
            } 
            //right shift
            n = n>>1;
        }
        return count;
    }

    //fast exponetioal
    public static int squer(int num , int pover){
        int ans = 1;
        while(pover>0){
            if((pover & 1) != 0){
                ans = ans * num;
            }
            num = num * num;
            pover = pover>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Odd_Even(2);
        Odd_Even(9);
        System.out.println(gat(10, 3));
        System.out.println(set(10, 2));
        System.out.println(clear(10, 1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(pover(8));

        int nums[] = {23,4,23,4,5,6,8,10,14,10,8,5,6};
        System.out.println(unique(nums));

        System.out.println(calculate(5));
        System.out.println(squer(3, 2));
    }
}