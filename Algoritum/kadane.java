// kadane Algo
public class kadane {
    public static void kadan(int number[]){

        // empty array
        if (number.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int sum = 0;
        int max_num = Integer.MIN_VALUE;

        //check all number is negative or not
        boolean allNegative = true;
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= 0) {
                allNegative = false;
            }
            max_num = Math.max(max_num, number[i]);
        }

        if (allNegative) {
            // If all numbers are negative, return the maximum single element
            System.out.println("Max subarray sum: " + max_num);
            return;
        }

        // if positiv
        for(int i=0;i<number.length;i++){
            sum = sum + number[i];
            if(sum < 0){
                sum = 0;
            }
            max_num = Math.max(sum, max_num);
        }
        System.out.println("max subarray sum :" + max_num);
    }

    public static void main(String[] args) {
        int number[] = {-2,-3,4,2,-5,-3};
        kadan(number);
    }
}
