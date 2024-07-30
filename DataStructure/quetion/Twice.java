//twice is come then true
//total tc = O(n)
import java.util.Arrays;
public class Twice {

    public static boolean twice(int nums[]){
        Arrays.sort(nums);  // tc = O(nlogn)

        for(int i=1; i < nums.length; i++){ // tc = O(n)
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        System.out.println(twice(nums));

    }
}
