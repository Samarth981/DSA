public class Example {
    public static int[] multi(int[] arr, int n) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] * n;
        }
        return newArr;
    }
}

