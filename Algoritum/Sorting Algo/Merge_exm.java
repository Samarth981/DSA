//multipal time come eliment find
public class Merge_exm {
    public static int Max_time_eli(int arr[], int start, int end){
        //base 
        if(start == end){
            return arr[start];
        }
        int mid = (end-start)/2 + start;
        int left = Max_time_eli(arr, start, mid);
        int right = Max_time_eli(arr, mid+1, end);
        return find_max_eli(arr, start, end, left, right);
    }
    public static int find_max_eli(int arr[], int start , int end, int left, int right){
        int rightCount = 0;
        int leftCount = 0;
        //left part
        for(int i=start ;i<end;i++){
            if(arr[i] == left){
                leftCount++;
            }
        }
        //right part
        for(int i=start ;i<end;i++){
            if(arr[i] == right){
                rightCount++;
            }
        }
        return leftCount > rightCount ? left : right;   
    }
    public static void main(String args[]){
        int arr[] = {2,1,2,1,1,2,2};
        System.out.println(Max_time_eli(arr, 0, arr.length-1));
    } 
}
