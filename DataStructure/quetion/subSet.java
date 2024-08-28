import java.util.ArrayList;
import java.util.List;
// tc = O(n * 2^n)
//optimiz -> backtracking + recurtion (2^n) 
public class subSet {
    public static List<List<Integer>> Subset(int arr[]) {
        int n = arr.length;
        int total_subset = 1 << n;  // Total subsets = 2^n
        List<List<Integer>> ans = new ArrayList<>(); //outer arr

        for (int i = 0; i < total_subset; i++) {
            List<Integer> subset = new ArrayList<>(); //inner arr
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if jth bit in i is set
                    subset.add(arr[j]); //ineer arr
                }
            }
            ans.add(subset); //outer arr
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 5};
        List<List<Integer>> subsets = Subset(arr);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
