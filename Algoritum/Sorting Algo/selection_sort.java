public class selection_sort {
    public static void selection(int num[]){ //tc = O(n^2)
        int n = num.length;
        for(int turn=0; turn<n-1;turn++){
            //find max eliment
            int max_num = 0;
            for(int i = 0; i<=n-1-turn ;i++){
                if(num[max_num] < num[i]){
                    max_num = i;
                }
            }
            //swap
            int temp = num[n-1-turn];
            num[n-1-turn] = num[max_num];
            num[max_num] = temp;
        }
    }

    public static void prints(int num[]){
        for(int i=0 ; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int num[] = {5,1,3,2,1,4,3};
        selection(num);
        prints(num);
    }
}
