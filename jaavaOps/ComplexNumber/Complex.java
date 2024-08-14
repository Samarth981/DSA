package ComplexNumber;

public class Complex {
    private int real;
    private int img;

    public Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public void printComplexNum() {
        if (this.img != 0) {
            System.out.println(this.real + " +i " + this.img);
        } else {
            System.out.println(this.real);
        }
    }

    //declar for add mathod
    //return complex value
    public Complex add(Complex c){
        Complex result =  new Complex(0,0); //object
        result.real = this.real + c.real; //c1.add(c2) -> c1 is this and c2 is c  
        result.img = this.img + c.img; 
        return result;
    }

    //or 

    // public Complex add(Complex c1, Complex c2){
    //     Complex result =  new Complex(0,0); //object
    //     result.real = c1.real + c2.real; //c1.add(c2) -> c1 is this and c2 is c  
    //     result.img = c1.img + c2.img; 
    //     return result;
    // }


}
