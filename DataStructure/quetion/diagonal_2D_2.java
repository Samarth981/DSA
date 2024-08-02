//secound best aproch
// tc = O(n)
public class diagonal_2D_2{
    public static int diagonal(int matrix[][]){
        int sum = 0;
        
        for(int i=0; i<matrix.length;i++){
            //primary diagonal
            sum = sum + matrix[i][i];

            //secoundary
            // i+j = n-1 , so j = n-1-i
            int j = matrix.length-1-i;

            if(i!=j){
                sum = sum + matrix[i][j];
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