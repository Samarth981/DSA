public class Binary{
    public static void Odd_Even(int num){
        int bitMask = 1;
        if((num & bitMask) == 0) {
            System.out.println("number" + num + "is even");
        }else{
            System.out.println("number " + num + " is odd");
        }
    }
    public static void main(String args[]){
        Odd_Even(2);
        Odd_Even(9);
    }
}