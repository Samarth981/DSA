//assinment queteion 1
public class grid_2 {
    public static boolean isSafe(int arr[][] , int row, int collum){
        //mage end or not 
        //[0,n-1) and one then true if 0 then false
        //arr[row][collum]==1 check like i+1 index 1 then move otherwis false
        if( row>=0 && row<arr.length && collum>=0 && collum<arr.length && arr[row][collum]==1){
            return true;
        }
        return false;
    }


    public static boolean parth(int arr[][] , int row, int collum,int sol[][]){
        //base
        if(row == arr.length-1 && collum == arr.length-1 && arr[row][collum] == 1){
            sol[row][collum] = 1;  //boundry 0 exist then not store and 1 exist then store
            return true;
        }

        //recurtion
            if(isSafe(arr, row, collum)){
                //if safe then first put this position 1
                if(sol[row][collum] == 1){  // track of the cell if it has been visited or not
                    return false; //If already visited then no need to traverse further from that cell
                }
                sol[row][collum] = 1; //store one and next line call
                if(parth(arr, row+1, collum, sol)){
                    return true;
                }
                if(parth(arr, row, collum+1, sol)){
                    return true;
                }
                sol[row][collum] = 0;
                return  false;
            }
        return false;
        }

    public static void printSolution(int sol[][]){
        for(int i=0;i<sol.length;i++) {
            for(int j=0;j<sol.length;j++) {
                System.out.print(" "+sol[i][j] +" ");
            }
                System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] = {
        {1, 0, 0, 0},
        {1, 1, 0, 1},
        {0, 1, 0, 0},
        {1, 1, 1, 1}
    };
        int solution[][] = new int[4][4];
        if (parth(arr, 0, 0, solution) == false) {
            System.out.println("No solution found");
        }
        printSolution(solution);
    }
}
