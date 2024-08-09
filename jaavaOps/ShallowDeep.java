public class ShallowDeep{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 50;

        //shallow
        Student s2 = new Student(s1);

        s1.marks[1] = 20; 

        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        } 

        //deep copy
        Student s3 = new Student(s1 , "deep");
        s1.marks[2] = 40;
        for(int i=0 ; i<3 ; i++){
            System.out.println(s3.marks[i]); //not change 40
        } 

        //agine print s2 
         for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]); //this is change and 40
        } 
    }
}

class Student{
    int marks[];

    //copy constructor
    //also call shallow copy constructor
    Student(Student s1){ 
    marks = new int[3];
    this.marks = s1.marks;
    }

    //deep copy constructor
    Student(Student s1, String name){
        System.out.println(name + "copy"); 
        marks = new int[3];
        for(int i=0; i<3; i++){
            this.marks[i] = s1.marks[i]; //creat new array in s2
        }
    }

    //creat constructor
    Student(){
        marks = new int[3];
    }
}