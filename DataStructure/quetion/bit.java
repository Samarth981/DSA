//maximum day of workers work in cobination
//tc = O(n^2)
//sc = O(n)
public class bit{
    //day store as a bitmask 
    public static int[] mask_conver(int arr[][],int days[]){
        int numWorkers = arr.length;
         //stor bit number in there
        for(int i=0;i<numWorkers;i++){ 
            int day=0; //reset day for each workers
            for(int j=0;j<arr[i].length;j++){
                day = day | (1<<arr[i][j]);
            }
            days[i] = day;
        }
        return days;
    }

    public static void max_day_work(int arr[]){
        int maxCount = 0;
        int persion1 = -1;
        int persion2 = -1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1 ; j<arr.length; j++){
                //check tow workers
                int intersection = (arr[i] & arr[j]);
                int count = count_coman_set(intersection);
                if(count > maxCount){
                    maxCount = count;
                    persion1 = i;
                    persion2 = j;
                }
            }
        }
        System.out.println("index "+ persion1 + " index "+persion2 + " both are work max comman days is " + maxCount);
    }
    public static int count_coman_set(int n){
        int count = 0;
        while(n>0){
            int LSB = n&1;
            if(LSB == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

        public static void main(String args[]){
        int workers[][] = {{1,4,7,9},{9,1,2,4},{2,9,10},{1,11,29,7}};
        int days[] = new int[workers.length];
        mask_conver(workers, days);
        max_day_work(days);
    }
}