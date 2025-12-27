
import java.util.*;

// SubArray Sum Equal to K
public class SubArraySumEqualK {

    public static void main(String[] args) {
        int num[] = {10, 2, -2, -20, 10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();

        //(sum,count)
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int j = 0; j < num.length; j++) {
            sum += num[j];

            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}
