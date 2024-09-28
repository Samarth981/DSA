import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void main(String args[]){
        Integer coin[] = {1,2,5,10,20,50,100,500,200};
        Arrays.sort(coin, Comparator.reverseOrder());
        int value = 314;

        ArrayList<Integer> ans = new ArrayList<>();
        int countCoin = 0;
        
        for(int i=0; i<coin.length; i++){
            if(coin[i] <= value){
                while(coin[i] <= value){
                    ans.add(coin[i]);
                    countCoin++;
                    value -= coin[i];
                }
            }
        }
        System.out.println("total min coin use in pay = " + countCoin);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
