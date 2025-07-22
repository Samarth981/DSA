
//find the next max for indivisual eliment
import java.util.Stack;

public class nextMax {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> st = new Stack<>();
        int nextMax[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextMax[i] = -1;
            } else {
                nextMax[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < nextMax.length; i++) {
            System.out.print(nextMax[i] + " ");
        }
        System.out.println();
    }
}
