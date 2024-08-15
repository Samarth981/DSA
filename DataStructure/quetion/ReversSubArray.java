// give left and right corner and only rever into this corner eliment 
//this is arra list code
//array is a work call by reference so only revers sub array part
import java.util.*;

public class ReversSubArray {
    public static ArrayList<Integer> reversSub(ArrayList<Integer> arr, int l,int r) {
         // Convert 1-based index to 0-based index
        l = l - 1;
        r = r - 1;
        // Get the length of the ArrayList
        // int n = arr.size();
        while(l<r){
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int l = 2;
        int r = 4;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        
        ArrayList<Integer> result = reversSub(arr, l, r);
        
        System.out.println(result); // Output: [1, 2, 7, 6, 5, 4, 3]
    }
}
