import java.util.Stack;

public class stackSpan {
    public static void stockspan(int stack[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stack.length; i++) {
            int currnt = stack[i];
            while (!s.isEmpty() && currnt > stack[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String args[]) {
        int stack[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stack.length];
        stockspan(stack, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println("");
    }
}
