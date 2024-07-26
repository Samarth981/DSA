import java.util.*;
//leet code Q.1
public class Two_Num{
    public static int[] twosum(int nums[], int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        // int[] ans = new int[2];
        while(left < right){
            int currant =  nums[left]+nums[right];
            
            if(currant < target){
                left++;
            } else if(currant > target){
                right--; 
            } else{
                return new int[]{left,right};
            }
    }
    return new int[]{};
}

    public static void main(String args[]){
        int nums[] = {2,4,8,11,12,14};
        int[] ans = twosum(nums, 15);
        System.out.println(ans[0] + "," + ans[1]);
    }
}