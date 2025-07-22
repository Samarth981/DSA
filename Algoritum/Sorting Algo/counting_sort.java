public class counting_sort {

    public static void count(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting 
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;  // store in original arr 
                j++;
                count[i]--;
            }
        }
    }
     public static void prints(int num[]){
        for(int i=0 ; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int num[] = {5,1,3,2,1,4,3};
        count(num);
        prints(num);
    }
}
