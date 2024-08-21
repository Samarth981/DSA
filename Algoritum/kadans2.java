//more optimize
// time complex -> O(n)

public class kadans2{
    public static void kadanes(int arr[])
    {
        int csum=arr[0];
        int max=arr[0];
        int min = arr[0];
        int csum_min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int sum = csum+arr[i];
            csum=Math.max(arr[i], sum);
            max=Math.max(csum, max);
            int sum2 = csum_min + arr[i];
            csum_min = Math.min(arr[i], sum2);
            min = Math.min(csum_min , min);
        }
        System.out.println("Our Max SubArray sum is: " + max);
        System.out.println("Our MIN SubArray sum is: " + min);
    }
    public static void main(String[] args) {
        int arr[]={-2,3,-1};
        kadanes(arr);
    }
}
