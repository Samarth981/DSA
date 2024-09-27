import java.util.Arrays;
import java.util.Comparator;

public class maxChaniOfPair {  // tc -> O(nlogn)
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
    
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1; //first pair is come
        int pairEnd = pairs[0][1]; //currnt change end

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > pairEnd){
                chainLen++;
                pairEnd = pairs[i][1];
            } 
        } 
        System.out.println("max chain length is = " + chainLen);
    }
}

