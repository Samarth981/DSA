
import java.util.Arrays;
import java.util.Comparator;

public class ftractionalKnapsack {
    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int m = 50;

        //2d arr reation 
        double ratio[][] = new double[val.length][2];
        //0th => index 
        //1th => ration
        for(int i=0; i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }

        //sorting 
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = m;
        int maxValue = 0;
        for(int i=ratio.length-1; 0<=i; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                maxValue += val[idx];
                capacity -= weight[idx];
            } else {
                maxValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(maxValue);
    }
}
