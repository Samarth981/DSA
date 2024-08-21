class SubProduct_max{
    public static int maxProduct(int number[]){

        // empty array
        if (number.length == 0) {
            return -1;
        }

        int sum = 0;
        int max_num = Integer.MIN_VALUE;


        for(int i=0;i<number.length;i++){
            sum = sum * number[i];
            if(sum == 0){
                sum = number[i];
            }
            max_num = Math.max(sum, max_num);
        }
        return max_num;
    }

    public static void main(String args[]){
        int arr[] = {2,-5,-2,-4,3}; //but max sum is -2,-4,3 is 24 so this is not use in this case 
        System.out.println(maxProduct(arr));
    }
}