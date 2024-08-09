public class ClassObject{
    public static void main(String args[]){
        Pan p1 = new Pan(); //created a pen object called p1
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

//fist latter is capital
class Pan {
    //propperty and function is deffin
    String color;
    int tip;

    void setColor(String newcolor){
        color = newcolor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
// class Student{
//     String name;
//     int age;
//     float CGPA;

//     void calculateCGPA(int phy, int math, int chem){
//         CGPA = (phy+math+chem) / 3;
//     }
// }