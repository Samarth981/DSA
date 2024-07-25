// tc = O(n) , sc O(1);
public class MaxStock{
    public static int MaxProfit(int DayPrice[]){
        int Max_Profit = 0;
        int Buy_Price = Integer.MAX_VALUE;
        for(int i=0;i<DayPrice.length;i++){
            if(Buy_Price < DayPrice[i]){ //profit come 
                int profit = DayPrice[i] - Buy_Price; //today profit
                Max_Profit = Math.max(Max_Profit, profit);
            }else{
                Buy_Price = DayPrice[i];
            }
        }
        return Max_Profit;
    }

    public static void main(String[] args) {
        // int price[] = {7,1,5,3,6,4};
        int price[] = {100,180,310,40,535,695};
        System.out.println("maximumm profit is come for : " + MaxProfit(price));
    }
}