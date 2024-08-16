//recurtion through sorting in java

//print all the occurnces in arry
public class recursionSearch{
    public static void search(int arr[],int key,int i){
        //base
        if(i == arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
            System.out.println();
        }
        search(arr, key, i+1);
    }

    //fist occurance
    public static int firstocc(int arr[],int key,int i){
        //base
        if(i == arr.length){
            return -1;
        }
        int recursiveAns =  firstocc(arr, key, i+1);
        //check condition 
        if(arr[i] == key){
            return i;
        } else {
            return recursiveAns;
        }
    }
    //only print first time come then print 
    public static int lastocc(int arr[],int key,int i){
        //base
        if(i == 0){
            return -1;
        }
        int recursiveAns =  lastocc(arr, key, i-1);
        //check condition 
        if(arr[i] == key){
            return i;
        } else {
            return recursiveAns;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        search(arr,key,0);
        int[] arr2 = {7,3, 2, 4, 5, 6, 2, 7, 2};
        System.out.println(firstocc(arr2, 7, 0));
        System.out.println(lastocc(arr2,7,arr2.length-1));
    }
}