public class SortedOrNot {
    public static boolean isSorted(int[] arr, int n) {
        if (n == 0 || n == 1) return true;
        if (arr[n - 2] > arr[n - 1]) return false;
        return isSorted(arr, n - 1);
    }

     public static boolean isSorted2(int[] arr, int i) {
        if (i == arr.length-1) return true;
        if (arr[i] > arr[i + 1]) return false;
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5, 7, 8,9,10};
        System.out.println(isSorted(arr, n));  
        System.out.println(isSorted2(arr, 0));  
    }
}
