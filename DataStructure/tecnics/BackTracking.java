public class BackTracking{
    public static void Changear(int arr[], int i,int value){
        //base
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //work
        arr[i] = value; //go to upp
        Changear(arr, i+1, value+1);
        arr[i] = arr[i] -2; //return time (Back tracking)
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        Changear(arr,0,1);
        printArr(arr);
    }
}