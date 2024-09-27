
import java.util.Arrays;

public class minAbsulueDeffrence {
    public static void main(String argas[]){
        int A[] = {1,2,3};
        int B[] = {2,1,3};
        
        Arrays.sort(A);
        Arrays.sort(B);
        int minDeffrence = 0;
        for(int i=0; i<A.length; i++){
            minDeffrence += Math.abs(A[i] - B[i]);
        }
        System.out.println("min absolute diffrence pair = " + minDeffrence);
    }
}
