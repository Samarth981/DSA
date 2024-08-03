// find key in 2D array
public class StairSearch{
        public static int FindKey(int matrix[][], int key){
        //top end
        // int row = 0, col = matrix[0].length-1;
        // while(row < matrix.length && col >=0){
        //     if(key == matrix[row][col]){
        //         System.out.println("found key at (" + row + "," + col +")");
        //         return 0;
        //     } else if(key < matrix[row][col]){
        //         //left
        //         col--;
        //     }else{
                //bottum
        //         row++;
        //     }
        // }

        //bottum start
        int row = matrix.length-1 , col = 0;
        while(row >=0  && col <=matrix[0].length){
            if(key == matrix[row][col]){
                System.out.println("found key at (" + row + "," + col +")");
                return 0;
            } else if(key > matrix[row][col]){
                //up
                col++;
            }else{
                //right
                row--;
            }
        }
        System.out.println("key is not found");
        return 0;
    }
    public static void main(String args[]){
        int matrix[][] = {
                        {1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}}; 
                        int key = 2;
        FindKey(matrix, key);
        
    }
}