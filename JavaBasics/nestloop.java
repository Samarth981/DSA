public class nestloop {
    public static void main(String[] args){
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);     
                ch++;       
            }
            System.out.println();
        }

        // hollow rectangle
        int row = 5;
        int col = 6;
        for(int i=1;i<=row;i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");   
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

        //inverted harf-pyramid
        for(int i=1;i<=5;i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
            System.out.print("*");
            }
            System.out.println();
        }
        
        //floyd's triangle
        int n=6;
        int temp = 1;
        for(int i=0;i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(temp);
                temp++;
                System.out.print(" ");
            }
            System.out.println();
        }

        //0-1 triangle
        int x=6;
        int y = 1;
        for(int i=0;i<x; i++){
            for(int j=0; j<i; j++){
                System.out.print(y);
                y = (y+1)%2;
                System.out.print(" ");
            }
            System.out.println();
        }




        //Butterflay


        //harf -up
        for(int i=0; i<=4; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            
            //space
            for(int k=2; k<2*(n-i-1);k++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //secound-harf
        for(int i=4; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            
            //space
            for(int k=2; k<2*(n-i-1);k++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
