//more optimize
// time complex -> O(n

public class kadans2{
    public static void kadanes(int arr[])
    {
        int csum=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int sum = csum+arr[i];
            csum=Math.max(arr[i], sum);
            max=Math.max(csum, max);
        }
        System.out.println("Our Max SubArray sum is: "+max);
    }
    public static void main(String[] args) {
        int arr[]={-2,3,-1};
        kadanes(arr);
    }
}
