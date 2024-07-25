//time complexcity is depend on hight like how many pillar are  in there
//so tc = O(n)
public class Trap_RainWAter {
    public static int  TrapWater(int h[]){
        int width = 1;

        //Calculate Left max boundary - array
        int leftMax[] = new int[h.length];
        leftMax[0] = h[0];

        for(int i=1; i<h.length; i++){
            leftMax[i] = Math.max(h[i], leftMax[i-1]);
        }

        //Calculate right max boundary - array
        int rightmax[] = new int[h.length];
        rightmax[h.length-1] = h[h.length-1];

        for(int i=h.length-2; i>=0; i--){
            rightmax[i] = Math.max(h[i], rightmax[i+1]);
        }

        //loop
        int trappwater = 0;

        for(int i = 0 ; i<h.length; i++){
            int waterlavel = Math.min(leftMax[i], rightmax[i]);
            trappwater = trappwater + ((waterlavel - h[i])*width);
        }
        return trappwater;
    }
    public static void main(String[] args) {
        int hight[] = {4,2,0,6,3,2,5};
        System.out.println("trap water is :" + TrapWater(hight));
    }
}
