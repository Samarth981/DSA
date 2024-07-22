import java.util.*;

// array quetion
public class Array {
    //Largest number in Array
    public static int largest_num(int number[]){
        int largest = Integer.MIN_VALUE; //-infinet

        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest value is :" + smallest);
        return largest;
    }
    public static void main(String[] args) {

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        // check array length
        System.out.println("length of array: "+marks.length);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("math :" + marks[2]);
        marks[2] = 100;
        System.out.println("math :" + marks[2]);

        //largest
        int number[] = {2,4,6,7,4,8,9};
        System.out.println("largest value is :"+ largest_num(number));

    }
}
