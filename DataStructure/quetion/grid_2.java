//assinment queteion 1
public class grid_2 {
    public static boolean isSafe(int arr[][] , int row, int collum){
        if(row + 1 < arr.length && arr[row+1][collum] != 1){
            return false;
        }else if(collum + 1 < arr[0].length && arr[row][collum+1] != 1){
            return false;
        }
        return true;
    }
    public static boolean parth(int arr[][] , int row, int collum,int sol[][]){
        //base
        if(row == arr.length-1 && collum == arr[0].length-1 && arr[row][collum] == 1  /* if 0 exist in qution then false*/){
            sol[row][collum] = 1; //not change one and call next
            return true;
        }
        //recurtion
        if (row < arr.length && collum < arr[0].length && arr[row][collum] == 1) {
            sol[row][collum] = 1;

            // Move down
            if (parth(arr, row + 1, collum, sol)) {
                return true;
            }

            // Move right
            if (parth(arr, row, collum + 1, sol)) {
                return true;
            }

            // Backtrack if neither down nor right works
            sol[row][collum] = 0;
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
        if (parth(arr, 0, 0, solution)) {
            printSolution(solution);
        } else {
            System.out.println("No solution found");
        }
    }
}
