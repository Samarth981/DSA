
import java.util.*;
//LeetCode -> 1636
class Solution {
    public int[] frequencySort(int[] nums) 
    {
        
        //Step1: Store in map
        // (arr[i], freq)
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int element = nums[i];

            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        int ans[] = new int[nums.length];
        
        //step2 : sorting
        ArrayList<Integer> arr = new ArrayList<Integer>(map.keySet());

        arr.sort((e1,e2) -> 
        {
            if(map.get(e1) != map.get(e2))
            {
                return map.get(e1) - map.get(e2);
            } else 
            {
                return Integer.compare(e2,e1);
            }
        })


        //store ans in ans
        int k =0;
        for(int i=0; i<arr.size(); i++)
        {
            int element = arr.get(i);
            int freq = map.get(element);

            for(int j=0; j<freq; j++)
            {
                ans[k] = element;
                k++;
            }
        }

        return ans;
    }
}