import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class activitySelection{
    public static void main(String args[]){
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9}; 
        
        // //end time basis Sorted

        // int maxAct = 0; 
        // ArrayList<Integer> ans = new ArrayList<>();

        // //1'st Activity
        // maxAct = 1;
        // ans.add(0); //index add 0
        // int lastEnd = end[0];
        // for(int i=1; i<end.length; i++){
        //     while(start[i] >= lastEnd){
        //         //activity select
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }
        // System.out.println("maxAct = " + maxAct);
        // for(int i=0; i<ans.size(); i++){
        //     System.out.print("A" + ans.get(i) + " ");
        // }
        // System.out.println();


        //if end is not sorted then sort it 
        int start[] = {3,0,1,5,8,3};
        int end[] =   {4,6,2,7,9,6}; 
        
        //creat 2d matrix 
        int[][] activities = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i; //index
            activities[i][1] = start[i]; //start
            activities[i][2] = end[i]; //end
        }

        //sort martrix base on end(collum-2)
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0; 
        ArrayList<Integer> ans = new ArrayList<>();

        //1'st Activity
        maxAct = 1;
        ans.add(activities[0][0]); //index add 0
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++){
            while(activities[i][1] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("maxAct = " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}