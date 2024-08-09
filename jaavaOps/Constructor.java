public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student("gfdhytd",3);
        System.out.println(s1.name);

        Student s2 = new Student(s1); 
        s2.age = 56;  //creat new password for s2
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}

class Student{
    String name;
    int age;

    Student(Student s1){ //copy constructor
    this.name = s1.name;
    }
    //creat constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}