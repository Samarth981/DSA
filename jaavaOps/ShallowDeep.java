public class ShallowDeep{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 50;
        
        //shallow
        Student s2 = new Student(s1);

        System.out.println("this is shallow");
        s1.marks[1] = 20; 
        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        } 
        System.out.println("...........");

        //deep copy
        Student s3 = new Student(s1 , "deep");
        s1.marks[2] = 40;
        for(int i=0 ; i<3 ; i++){
            System.out.println(s3.marks[i]); //not change 40 in orignal
        } 
        System.out.println("...........");

        //agine print s2 
        System.out.println("deepcopy is not change 40 but shallow change ");
         for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]); //this is change and 40
        } 




        Strings s5 = new Strings("gfdhytd", 3);
        System.out.println(s5.name);  // Output: gfdhytd
        System.out.println(s5.age);   // Output: 3

        Strings s6 = new Strings(s5);  // Shallow copy of s5
        s6.age = 56;  // Change the age of s6
        System.out.println(s6.name);  // Output: gfdhytd (still the same as s5)
        System.out.println(s6.age);   // Output: 56 (new value)

        // Change s5.name to "samarth"
        s5.name = "samarth";  // This creates a new string and does not affect s6.name
        System.out.println("After changing s5.name:");
        System.out.println(s5.name);  // Output: samarth
        System.out.println(s6.name);  // Output: gfdhytd (still the same, not affected by s5 change)

        // Deep copy example with message
        Strings s7 = new Strings(s5, " this is deep copy");
        System.out.println(s7.name);  // Output: samarth (deep copied value from s5)
        System.out.println(s7.age);   // Output: 3 (deep copied value from s5)

        // Verifying shallow copy behavior
        System.out.println(s6.name);  // Output: gfdhytd
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

class Strings {
    String name;
    int age;

    // Shallow copy constructor
    Strings(Strings s5) {
        this.name = s5.name;  // Shallow copy (both s5 and s6 share the same reference)
        this.age = s5.age;    // Copying the age
    }

    // Deep copy constructor
    Strings(Strings s5, String message) {
        this.name = new String(s5.name);  // Deep copy (new String object)
        this.age = s5.age;  // Copying the age
        System.out.println(message);  // Display the message
    }

    // Standard constructor
    Strings(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
