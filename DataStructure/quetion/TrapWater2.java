// tc = O(n) , sc O(1)
// two pointer tacnic
public class TrapWater2 {
    public static int trappwater(int hight[]){
        int l = hight.length; 
        int width =1;
        int left = 0;
        int right = l-1;
        int leftMax = 0;
        int rightmax = 0;
        int trappwater = 0;
        while(left<=right){
            if(hight[left] <= hight[right]){

                //if leftMax is small then water is not trapp
                if(hight[left] > leftMax){
                    leftMax = hight[left];
                } else {
                    trappwater = trappwater + ((leftMax - hight[left])*width);
                }
                left++;
            }else {
                if(hight[right] > rightmax){
                    rightmax = hight[right];
                } else {
                    trappwater = trappwater + ((rightmax - hight[right])*width);
                }
                right--;
            }
        }
        return trappwater;
    }
    public static void main(String[] args) {
        int hight[] = {4,2,0,6,15,2,5};
        System.out.println("trap water is :" + trappwater(hight));
    }
}
