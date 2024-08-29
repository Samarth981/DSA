public class N_Queen {
    public static void nQueen(char  arr[][] , int i){
        //base
        if(i == arr.length){
            count++;
            printArr(arr);
            return;
            // return true;
        }

        //colume loop   
        for(int j=0; j<arr.length ; j++){
            //check condition for not atteck then store
            if(IsSafe(arr,i,j)){
                arr[i][j] = 'Q'; 
                nQueen(arr,i+1); //call secound queen in next row  
                //if in quetion only 1 pair give then
                // if(nQueen(arr, i+1){
                //     return true; //if exist
                // });
                //other area is empty
            }
            arr[i][j] = '_'; //if false then empty then call j++
        }
        
    }

    public static boolean IsSafe(char[][] arr,int i,int j){
        //vertical up
        for(int x=i-1; x>=0; x--){
            if(arr[x][j] == 'Q'){ //uper check
                return false;
            }
        }
        //diagonal left up
        for(int x = i-1 , y = j-1; x>=0 && y>=0; x--, y--){
            if(arr[x][y] == 'Q'){
                return false;
            }
        }
        //diagoal right up
        for(int x = i-1 , y = j+1; x>=0 && y<arr.length; x--, y++){
            if(arr[x][y] == 'Q'){
                return false;
            }
        }
        return true;
    }
    
    static int  count = 0;
    public static void main(String args[]){
        int n=4;
        char arr[][] = new char[n][n];

        //initialize all empty
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = '.'; //empt arr
            }
        }
        nQueen(arr, 0);
        System.out.print(count);
    }
    public static void printArr(char  arr[][]){
        System.out.println("-----------------------------");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
