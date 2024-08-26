// count inversion for sorting arr

public class Merge_exm2 {

    public static int Counting(int arr[] , int start , int mid , int end) {
        int temp[] = new int[end-start+1];
        int i = start;
        int j=mid+1;
        int k=0;
        int invCount = 0;
        while(i<=mid && j<=end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                invCount = invCount + (mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        // Copy remaining elements from left half, if any
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half, if any
        while(j<=end){
            temp[k++] = arr[j++];
        }

        //this temp arr move in orignal arr
        for(k=0 ,  i=start ; k<temp.length ; k++ , i++){   
            arr[i] = temp[k];
        }
        return invCount;
    }
    public static int Inversion(int arr[], int start, int end){
        //base
        if(start>=end){
            return 0;
        }
        int mid = start + (end-start)/2;
        int ans_left = Inversion(arr, start, mid);
        int ans_right = Inversion(arr, mid+1, end);
        int ans_both_cobination = Counting(arr, start, mid, end);
        return ans_left + ans_right + ans_both_cobination;
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,3,5};
        System.out.println(Inversion(arr, 0, arr.length-1));
    }
}
