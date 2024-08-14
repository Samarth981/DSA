public class staticsKey{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.SchoolName = "jvm";
        Student s2 = new Student();
        System.out.println(s2.SchoolName); //jvm becuser static olredy store jvm

        Supers su = new Supers();
        // su.Supers();
    }
}

class Student{
    String name;
    static String SchoolName;


    //get & set
    void setName(String name){
        this.name = name;
    }
    String getName(String name){
        return this.name;
    }
}

//super keyword use 
class roll{
    roll(){ //constructor
        System.out.println("call super");
    }
}
class Supers extends roll{
     Supers() {
        super();
        System.out.println("it is call");
    }
}