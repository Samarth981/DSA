//find possible parth to move start to end in nxm grid

public class grid{
    //tc = 0(2^(n+m)) 
    public static int numOfWay(int row,int collum,int n,int m){
        //base
        if(row == n-1 && collum == m-1){
            return 1;
        }else if(row == n || collum == m){
            return 0; //boundary cross condition
        }
        return numOfWay(row+1, collum, n, m) + numOfWay(row, collum+1, n, m);
        
    }
    public static int MathsWay(int n,int m){
        int num_way = fact(n-1+m-1);
        int comman_row = fact(n-1);
        int comman_collum = fact(m-1);
        int total = num_way/(comman_row * comman_collum);
        return total; 
    }
    //factorial 
    public static int fact(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n = 6 , m=3;
        System.out.println(numOfWay(0, 0, n, m));
        System.out.println(MathsWay(n, m));
    }
}