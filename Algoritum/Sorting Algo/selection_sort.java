public class selection_sort {
    public static void selection(int num[]){ //tc = O(n^2)
        int n = num.length;
        for(int turn=0; turn<n-1;turn++){
            //find max eliment
            int min_num = turn;
            for(int i = turn+1; i<=n ;i++){
                if(num[min_num] >  num[i]){
                    min_num = i;
                }
            }
            //swap
            int temp = num[min_num];
            num[min_num] = num[turn];
            num[turn] = temp;
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
