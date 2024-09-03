
import java.util.ArrayList;

public class towSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int breakPoint = -1;
        
        // Find the break point
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakPoint = i;
                break;
            }
        }
        
        int lp = (breakPoint + 1) % n; //%n because do not go outoff range 
        int rp = breakPoint;
        
        // Start finding sum
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % n; // Move right pointer to the next index
            } else {
                rp = (n + rp - 1) % n; // Move left pointer to the previous index
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        
        System.out.println(pairSum(list, target)); // Should return true
    }
}