public class quetion_2d{

    public static int printNum(int matrix[][]){
        int countof7 = 0;

        for(int row=0;row<matrix.length;row++){
                                                        
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==7){
                    countof7++;
                }
            }
        }
        return countof7;
    }


    public static int printNum2(int matrix[][]){
        int sum = 0;

        for(int col=0;col<matrix[0].length;col++){
            sum = sum + matrix[1][col];
        }
        return sum;
    }


    public static void printNum3(int matrix[][]){
        int tansform[][] = new int[3][2];

        for(int row= 0; row<2;row++){
        
            for(int col=0;col<3;col++){
                tansform[col][row] = matrix[row][col];
            }
        }
        printmatrix(tansform);
    }


    public static void printmatrix(int matrix[][]){
    
        for(int row= 0; row<matrix.length;row++){
    
            for(int col=0;col<matrix[0].length;col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    public static float sort_path(String direction){
        int x=0 , y=0;
    
        for(int i= 0; i<direction.length();i++){
            char dir = direction.charAt(i);
            if(dir == 'N'){
                y++;
            } else if(dir == 'S'){
                y--;
            } else if(dir == 'E'){
                x++;
            } else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void comper(String str[]){
        String largest = str[0];
    
        for(int i=0; i<str.length;i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        System.out.println("largest : " + largest);
    }
    
    public static void main(String args[]){
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.println(printNum(matrix));
    
        int matrix2[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(printNum2(matrix2));
    
        int matrix3[][] = {{1,2,3},{4,5,6}};
        printNum3(matrix3);

        String direction = "WNEENESENNN";
        System.out.println("sort path is " + sort_path(direction));

        String str[] = {"mango","banana","apple"};
        comper(str);
    }
}