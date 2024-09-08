// tc = n(logn)
// sc = O(1)
//search sorted & rotated string.
public class Quicks_exm{
    public static int Search(int arr[],int start,int end,int key){
        int mid = start + (end - start)/2;
        if(arr[mid] == key){
            return mid;
        }
        //line -1
        if(arr[start] < arr[mid]){
            if(arr[start]<=key && key<arr[mid]){
                // line-1 left part
                return Search(arr, start, mid-1, key);
            }else{
                // line 1 right part
                return Search(arr, mid+1, end, key);
            }
        } 
        else //line-2
        {
            if(arr[mid]<=key && key<=arr[end]){
                // line-2 right part part
                return Search(arr, mid+1, end, key);
            }else{
                // line 2 left part
                return Search(arr, start, mid-1, key);
            } 
        }

        
    }
    public static void main(String args[]){
        int[] arr = {4,5,6,7,0,1,2};
        int Tind = Search(arr, 0, arr.length-1,0);
        System.out.println(Tind);
    }
}