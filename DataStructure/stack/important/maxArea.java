import java.util.Stack;
public class maxArea{

    public static int maxarea(int arr[]){
        int n = arr.length;
        int maxAre = 0;
        int nsl[] = new int[n];
        int nsr[] = new int[n];
        
        //next small eliment
        Stack<Integer> s = new Stack<>();
        for(int i=n-1; i>=0; i--){      //O(n)
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //privious samll emiment
         s = new Stack<>(); //empty
        for(int i=0; i<n; i++){ //O(n)
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //currnt area
        for(int i=0; i<n; i++){  //O(n)
            int hight = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currntArea = hight * width;
            maxAre = Math.max(currntArea, maxAre);
        }

        return maxAre;
    }
    public static void main(String[] args) {
        int hight[] = {2,1,5,6,2,3};
        System.out.println(maxarea(hight));
    }
}