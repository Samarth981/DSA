//basic approch
//tc = O(n^2)
public class diagonal_2D{
    public static int diagonal(int matrix[][]){
        int sum = 0;
        //primary diagonal
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i==j){
                    sum = sum + matrix[i][j];
                }
                //secoundry diagonal
                else if(i+j == matrix.length-1){
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {
                        {1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12},
                        {13,14,15,16}}; 
        System.out.println(diagonal(matrix));
    }
}