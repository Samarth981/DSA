//tiles size = 2 x 1
//box size = 2 x n
//find number off way to put tiles in box and box full
class tilling{
    public static int numOfWay(int n){ //2 x n (floor   size)
        //base 
        if(n==0 || n==1){
            return 1;
        }
        //kam
        //vertical choice
        int choice_vartical = numOfWay(n-1);  //inner case for vartical

        //vartical choice
        int choice_horizontal = numOfWay(n-2); //innerr case for horizontal
        int way = choice_horizontal + choice_vartical;

        return way;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numOfWay(n));
    }
}
