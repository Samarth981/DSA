import java.util.Scanner;

public class TypeCon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // type conversion

        int a = 25;
        long b =a;
        System.out.println(b);

        // long c = 25;
        // int d = c;
        // System.out.println(d);

        // float num = sc.nextInt();
        // int num2 = sc.nextFloat();

        // exmple for IMP

        int a1 = 4;
        int a2 = 5;
        int a3 = 4;
        double avr = (a1+a2+a3)/3; //ans is 4.0
        System.out.println(avr);

        double avr2 = (a1+a2+a3)*1.0/3; //ans is 4.33333333
        System.out.println(avr2);

        double avr3 = (a1+a2+a3)/3.0; //ans is 4.33333333
        System.out.println(avr3);


        // Type Casting


        double b1 = 25.123456789;
        // int b2 = b1; //error
        float b2 = (float)b1;
        System.out.println(b2);

        //exmple
        char x = 'c';
        int num = x;
        System.out.println(num); //it is possible because all char is particular number

        // int p = 105;
        // char y = p;
        // System.out.println(y); //it is not posible

        // Type Promotion
    }
}

