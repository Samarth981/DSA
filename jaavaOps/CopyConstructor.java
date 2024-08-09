public class CopyConstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 50;

        Student s2 = new Student(s1); // copy

        // I am tray if marks s1 is change then does not change s2 marks
        //but this is not possible  
        //this is array and array work call by reference concept

        //I know this is possible using shallow and deep copy concept

        s1.marks[2] = 20; 

        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        } 
    }
}

class Student{
    int marks[];

    Student(Student s1){ //copy constructor
    marks = new int[3];
    this.marks = s1.marks;
    }
    //creat constructor
    Student(){
        marks = new int[3];
    }
}