public class Bubble_Sort{
    public static void Bubble(int num[]){ //tc = O(n^2)
        int n = num.length;
        for(int turn=0; turn<n-1;turn++){
            for(int i=0; i<=n-2-turn;i++){
                if(num[i] > num[i+1]){
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
        }
    }

    public static void selection(int num[]){ //tc = O(n^2)
        int n = num.length;
        for(int turn=0; turn<n-1;turn++){
            //find max eliment
            int max_num = Integer.MIN_VALUE;
            for(int i = 0; i<n-1-turn ;i++){
                if(max_num < num[i]){
                    max_num = i;
                }
            }
            //swap
            int temp = num[n-1-turn];
            num[n-1-turn] = num[max_num];
            num[max_num] = temp;
        }
    }

    public static void insertion(int num[]){
        int n = num.length;
        for(int i=1; i<n;i++){
           int unsorted_pick_ele = num[i];
           int preveous_ele = i-1; //last sorted eliment

           //find correct possion of insertion
           while(preveous_ele >= 0 && num[preveous_ele] > num[unsorted_pick_ele]){
            num[preveous_ele+1] = num[preveous_ele]; //current hato tya 
            preveous_ele--;
           }
           //push in correct possion
           num[preveous_ele+1] = unsorted_pick_ele;

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
        Bubble(num);
        prints(num);
    }
}