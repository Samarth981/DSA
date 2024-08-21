public class a {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0; // Return 0 for empty array
        }
    
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;
    
        for (int i = 1; i < nums.length; i++) {
            int temp_max = Math.max(nums[i], Math.max(max_so_far * nums[i], min_so_far * nums[i]));
            min_so_far = Math.min(nums[i], Math.min(max_so_far * nums[i], min_so_far * nums[i]));
            max_so_far = temp_max;
            result = Math.max(result, max_so_far);
        }
        return result;
    }
}
