// Minimize Sum of Maximum Elements

// You are given an array nums and an integer m. 
// Your task is to split the array into exactly m contiguous subarrays. 
// For each subarray, you take the maximum number from that subarray. 
// Your goal is to minimize the sum of these maximum numbers.
public class Minimize_SumOf_Eli {
    public static boolean isPosible(int nums[], int mid, int k) {
        int count = 1;
        int maxInpartion = nums[0];
        int sum = maxInpartion; // Sum of maximum elements in partitions

        for (int i = 1; i < nums.length; i++) {

            maxInpartion = Math.max(nums[i], maxInpartion);

            // If adding the current max exceeds the mid limit, create a new partition
            if (sum + maxInpartion > mid) {
                count++;
                maxInpartion = nums[i]; // secound partition max find
                sum = maxInpartion; // max value sum
            } else {
                sum = sum + maxInpartion;// secound part max is add
            }
        }
        return count <= k;
    }

    public static int minimizeSumOfMaxElements(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        int higher = sum;
        int lover = max;
        int ans = 0;

        while (lover <= higher) {
            int mid = lover + (higher - lover) / 2;

            if (isPosible(nums, mid, k)) {
                ans = mid;
                higher = mid - 1;
            } else {
                lover = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 7, 2, 5, 10, 8 };
        int k = 3;
        System.out.println(minimizeSumOfMaxElements(nums, k));
    }
}

/*
 * nums = [7, 2, 5, 10, 8]
 * mid = 17
 * k = 2
 * Iteration through the array:
 * First Element (nums[0] = 7):
 * 
 * maxInPartition = 7
 * sumOfMax = 0 + 7 = 7
 * We continue adding to the same partition because sumOfMax (7) < mid (17).
 * Second Element (nums[1] = 2):
 * 
 * maxInPartition = max(7, 2) = 7
 * sumOfMax = 7 + 7 = 14
 * We continue adding to the same partition because sumOfMax (14) < mid (17).
 * Third Element (nums[2] = 5):
 * 
 * maxInPartition = max(7, 5) = 7
 * sumOfMax = 14 + 7 = 21
 * Now, sumOfMax (21) > mid (17), so we finalize this partition.
 * We start a new partition:
 * count = 2 (we now have 2 partitions).
 * sumOfMax = 7 (start with maxInPartition = 5 for this partition).
 * maxInPartition = nums[2] = 5.
 * Fourth Element (nums[3] = 10):
 * 
 * maxInPartition = max(5, 10) = 10
 * sumOfMax = 10 + 10 = 20
 * sumOfMax (20) > mid (17), so we finalize this partition.
 * We start another new partition:
 * count = 3 (we now have 3 partitions).
 * At this point, count (3) > k (2), so the function returns false.
 */