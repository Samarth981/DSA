
import java.util.Scanner;

public class question {
    //modul-6  exmple-3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pan = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pan + eraser;
        System.out.println("total price is"  + total);

        //18% gst
        float NewTotal = (total*0.18f) + total;
        System.out.println("including gst total amaount:" + NewTotal);


        int $ = 24; //not give error    


        //modul-7 exmple3
        int x,y,z;
        x=y=z=2;
        x+=y;
        y -= z;
        z /= (x+y);
        System.out.println(x + " " + y+ " " +z );

        //exmple 4
        int p = 9, q = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (p + 34) + 9 * (a + b * c) + (3 + q * (2 + a)) / (a + b*q);
        System.out.println(exp);



        //module-8
        //income tex calculater 
        int income = sc.nextInt();
        int text;
        if(income < 500000) {
            text = 0;
        } else if(income >= 500000 && income < 1000000){
            text = (int)(income * 0.20);
        } else {
            text = (int)(income * 0.30);
        }
        System.out.println("Your text is : "+text);
    }
}
