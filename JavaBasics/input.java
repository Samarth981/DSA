import java.util.Scanner;

public class input {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          // String input = sc.next();
          // System.out.println(input);
          String input_2 = sc.nextLine();
          System.out.println(input_2);
          int number = sc.nextInt();
          System.out.println(number);

          //sum of tow number
          int number1 = sc.nextInt();
          int number2 = sc.nextInt();
          // int sum = number1 + number2;
          int product = number1 * number2;
          System.out.println(product);

          //area of circle
          float rad = sc.nextFloat();
          float area = 3.14f * rad * rad;
          System.out.println(area);
     }
}
