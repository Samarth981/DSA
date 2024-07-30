import java.util.Arrays;
public class threeSum {
    //if only one pare find then this.

    public static int[] threesum(int nums[], int target){
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++){
            int newTar = target - nums[i];
            int l = i+1;
            int r = n-1;
            while(l<r){
                int currant = nums[l] + nums[r];
                if(currant < newTar){
                    l++;
                }else if(currant > newTar){
                    r--;
                }else{
                    return new int[]{i,l,r};
                }
            }
        }
        return new int[]{};
    }


    //if multipla pair is find 
    public static void three_sum_multi_pair(int nums[], int target){
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++){
            // Avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int newTar = target - nums[i];

            int l = i+1;
            int r = n-1;
            while(l<r){
                int currant = nums[l] + nums[r];
                if(currant < newTar){
                    l++;
                }else if(currant > newTar){
                    r--;
                }else{
                    System.out.println("triplet is :" + nums[i] + "," + nums[l] +"," + nums[r]);
                    l++;
                    r--;
                    //Avoid duplicate pair
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l > r && nums[r] == nums[r-1]){
                        r--;
                    }

                }
            }
        }
    }
    public static void main(String args[]){
        int target = 0;
        int nums[] = {-1,0,1,2,-1,-4};
        int[] ans = threesum(nums, target);
        System.out.println(ans[0] + "," + ans[1] + "," +ans[2]);
        System.out.println();
        three_sum_multi_pair(nums, target);
    }
}
