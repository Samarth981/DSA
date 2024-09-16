import java.util.Stack;

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
    //video - https://www.youtube.com/watch?v=lhzrp3Nbj-w&t=277s
    public static int trapWater(int[] h) {
        Stack<Integer> stack = new Stack<>();
        int trappedWater = 0;
        int n = h.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && h[i] > h[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int leftIndex = stack.peek();
                int width = i - leftIndex - 1;
                int height = Math.min(h[leftIndex], h[i]) - h[top];

                if (height > 0) {
                    trappedWater += width * height;
                }
            }
            stack.push(i);
        }
        return trappedWater;
    }
        public static void main(String args[]){
        int stack[] = {100,80,60,70,60,85,100};
        int span[] = new int[stack.length];
        stockspan(stack,span);

        for(int i=0 ; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
        System.out.println("");

        int h[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water is: " + trapWater(h)); // Expected output: 10
    }
}
