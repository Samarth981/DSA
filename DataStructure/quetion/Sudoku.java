public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int collum, int key,int n,int m){
        //check row
        for(int i=0; i<n;i++){
            if(sudoku[i][collum] == key){
            return false;
            }
        }

        //check collum
        for(int j=0;j<m;j++){
            if(sudoku[row][j] == key){
                return false;
            }
        }

        //check particular grid
        int start_row = (row/3)*3;
        int start_collum = (collum/3)*3;
        for(int i=start_row; i<start_row+3; i++){
            for(int j=start_collum; j<start_collum+3; j++){
                if(sudoku[i][j] == key){
                    return false;
                }
            }
        }
        return true; 
    }
    public static boolean SudokuSolve(int arr[][],int row, int collum,int n,int m){
        //base
        if(row == n && collum== 0){
            return true;
        }


        //recurtion

        int nextRow = row, nextCol = collum+1;
        if(collum+1 == m){ //collum is end then
            nextRow = row+1;
            nextCol = 0; //next collum is start to start in next row
        }

        //if eliment olerdy place then eliment go next collum 
        if(arr[row][collum] != 0){
            return SudokuSolve(arr, nextRow, nextCol,n,m);
        }

        for(int digit=1;digit<=9;digit++){
            if(isSafe(arr, row, collum, digit,n,m)){ //if it is safe then digit stor 
                arr[row][collum] = digit;
                if(SudokuSolve(arr, nextRow, nextCol,n,m)){ // sollution exist for next leval then ture if not exit then problem in privious 
                    return true;
                }
                arr[row][collum] = 0;//backtrack if sudoku is particular digit(col+1) is not posible then agine 0 and check next digit;
            }
        }
        return false;
    }


    public static void printSudoku(int arr[][], int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n = 9 , m = 9;
        int Sudokus[][] =  {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(SudokuSolve(Sudokus,0,0,n,m)){
            System.out.println("Sudolu is possible");
            printSudoku(Sudokus,n,m);
        }else{
            System.out.println("sollution is not exist");
        }
    }
}
