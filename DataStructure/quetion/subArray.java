public class subArray {
    public static void sub(int number[]){
        //find first
        int ts=0;
        int sum = 0;
        int lasgest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            // find last
            for(int j=i; j<number.length; j++){
                ts++;

                //print subarray
                sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                    sum = sum+number[k];
                }
                System.out.print("sum: "+ sum);
                //check smallest and largest
                if(sum>lasgest){
                    lasgest = sum;
                }
                if(sum<smallest){
                    smallest = sum;
                }
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("total sub Array: " + ts);
        System.out.println("largest: "+ lasgest);
        System.out.println("smallest: "+ smallest);
    }
    public static void main(String[] args) {
        int number[] = {1, -2, -6, -1, 3};
        sub(number);
    }
}
