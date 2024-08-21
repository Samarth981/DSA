public class Merge_Sort{
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int start, int end){
        //base
        if(start>=end){
            return;
        }

        //step -1 -->find mid
        int mid = start+(end - start)/2;  
        //find left part
        MergeSort(arr, start, mid);
        //find right part
        MergeSort(arr, mid+1, end);

        //merging function call
        Merge(arr,start,mid,end);
    }
    public static void Merge(int arr[] , int st , int mid,int end){
        int temp[] = new int[end - st +1];
        int i = st; //index of 1st sorted part
        int j = mid+1; //index of 2st sorted part
        int k = 0;

        //copy part in array
        while(i <= mid &&  j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
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
        for(k=0 ,  i=st ; k<temp.length ; k++ , i++){   
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}