package ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 4);
        Complex c2 = new Complex(7, 8);

        c1.printComplexNum();
        c2.printComplexNum();

        Complex res = c1.add(c2);  //creat a add method 

        // Complex def = new Complex(0, 0);
        // Complex res = def.add(c1,c1) //if use secound method
    }
}

//note for last quetion 
// static -> normal block -> constructor calling 
