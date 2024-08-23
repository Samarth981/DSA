public class Quick_sort {
    public static void prints(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quicks(int arr[], int start, int end){
        //base
        if(start>=end){
            return;
        }
        //select pivot --> lasr eliment
        int partition_index = partition(arr,start,end);
        Quicks(arr, start, partition_index-1); //left part
        Quicks(arr, partition_index+1, end); //right part
    }
    public static int partition(int arr[],int start, int end){
        int pivot = arr[end];
        int i = start -1; //work for free space in arr
        for(int j=start; j<end;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //pivot is going into a center part like
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args){
        int arr[] = {3,2,1,4,7,8,9,5};
        Quicks(arr, 0, arr.length-1);
        prints(arr);
    }
}
