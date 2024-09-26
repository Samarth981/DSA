//find a maximum of K for in array indivisual eliment 
// Queue assinment- Q- 5
import java.util.Deque;
import java.util.LinkedList;
// Time Complexity  : o(n)
// Space Complexity: o(k)

public class SlidingWindow {

    static void printMax(int arr[], int n, int k) {

        Deque<Integer> dq = new LinkedList<>();
        // Process first k (or first window) elements of array
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (int i = k; i < n; i++) {
            // The element at the front of the queue is the largest element of previous window
            System.out.print(arr[dq.peek()] + " ");

            // Remove the elements which are out of this window
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }

            // Remove all elements smaller than the currently being added element (Remove useless elements)
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            // Add current element at the rear of dq
            dq.addLast(i);
        }

        // Print the maximum element of last window
        System.out.println(arr[dq.peek()]);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int n = arr.length;
        int k = 3;
        printMax(arr, n, k);
    }
}
