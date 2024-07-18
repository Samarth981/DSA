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
        for(int i=1;i<=4;i++){
            for(int j=1; j<=5; j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("*");   
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
