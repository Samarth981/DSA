class powerOfX_rec{
    public static int isPower(int x , int pow){        // tc = O(n)
        //base
        if(pow == 0){
            return 1;
        }
        // int value = isPower(x, pow-1);
        // int ans  = x * value;
        return x * isPower(x, pow-1);
    }
    
    //tc = O(logn)
    public static int optimize_isPower(int x , int pow){
        //base
        if(pow == 0){
            return 1;
        }
        //comen for both 
        int harf = optimize_isPower(x, pow/2);
        int harfPowerSq = harf *  harf;

        // n is odd
        if(pow % 2 != 0){
            harfPowerSq = x * harfPowerSq;
        }
        return harfPowerSq;
    }
    
    //tc = O(n)
    //first and 2 optimze method is olmost same then why deffrent time? -> in time complexcity chepter
    public static int optimize_isPower2(int x , int pow){ 
        //base
        if(pow == 0){
            return 1;
        }
        //comen for both 
        int harfPowerSq =optimize_isPower2(x, pow/2) * optimize_isPower2(x, pow/2); // main deffrence for this line in tc

        // n is odd
        if(pow % 2 != 0){
            harfPowerSq = x * harfPowerSq;
        }
        return harfPowerSq;
    }

    //use long for as a exmple
    public static long optimize_isPower3(long x , long pow){
        //base
        if(pow == 0){
            return 1;
        }
        //comen for both 
        long harf = optimize_isPower3(x, pow/2);
        long harfPowerSq = harf *  harf;

        // n is odd
        if(pow % 2 != 0){
            harfPowerSq = x * harfPowerSq;
        }
        return harfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int pow = 30; // ans for this pow is overflow because int store only 2^31
        //use long for big
        System.out.println(isPower(x , pow));
        System.out.println(optimize_isPower(x, pow));

        long a = 3;
        long b = 300;
        System.out.print(optimize_isPower3(a, b));
    }
}