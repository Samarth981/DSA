//array is sorted or not
//tc = O(n)
public class recurtion_Sort{
    public static boolean sort(int arr[], int i ){
        //base
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sort(arr , i+1);
    }
    public static void main(String args[]){
        int arr[] = {5,5,6,7,8,9};
        System.out.println(sort(arr, 0));

    }
}