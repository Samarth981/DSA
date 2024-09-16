import  java.util.*;

public class stackSpan {
    public static void stockspan(int stack[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<stack.length;i++){
            int currnt = stack[i];
            while(!s.isEmpty() && currnt > stack[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }


    //same logic for trap rain water using stack 
    //this is not use for solve this problem only understanding of stack 
    public static int trapWater(int[] h) {
        Stack<Integer> stack = new Stack<>(); // Step 1
        int trappedWater = 0; // Step 2
        int n = h.length;

        for (int i = 0; i < n; i++) { // Step 3
            while (!stack.isEmpty() && h[i] > h[stack.peek()]) { // Step 4
                int top = stack.pop(); // Step 5
                if (stack.isEmpty()) { // Step 6
                    break;
                }
                int leftIndex = stack.peek(); // Step 7
                int width = i - leftIndex - 1; // Step 8
                int height = Math.min(h[leftIndex], h[i]) - h[top]; // Step 9
                trappedWater += width * height; // Step 10
            }
            stack.push(i); // Step 11
        }
        return trappedWater; // Step 12
    }

    public static void main(String args[]){
        int stack[] = {100,80,60,70,60,85,100};
        int span[] = new int[stack.length];
        stockspan(stack,span);

        for(int i=0 ; i<span.length; i++){
            System.out.print(span[i] + " ");
        }

        int h[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water is: " + trapWater(h)); // Expected output: 10
    }
}
