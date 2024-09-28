
import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing{
    static class job{
        //blueprint of job
        int dedline;
        int profit;
        int id; //0,1,2,...

        public job(int i, int d, int p){
            id = i;
            dedline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        // jobsInfo is define as a object arrList
        ArrayList<job> jobs = new ArrayList<>(); 

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //sorting arrList
        // Collections.sort(jobs, (a,b) -> a.profit-b.profit);// assending order of profit
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);  //desending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            job curr = jobs.get(i);
            if(curr.dedline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max job = " + seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}