//arrlist is sorted 
import java.util.ArrayList;
public class towSum{
    public static boolean pairSum(ArrayList<Integer> list , int target){
        int st = 0;
        int end = list.size()-1;
        while(st != end){
            int sum =  list.get(st) + list.get(end);
            if( sum == target){
                return true;
            }else if (sum<target){
                st++;
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list,5));

    }
}
