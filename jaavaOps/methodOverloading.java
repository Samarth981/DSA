//this is function overloading (compile time)
//same methdoverloading 

//mathod overriding  (run time)
public class methodOverloading{
    public static void main(String args[]){
        calculator obj = new  calculator();
        Deer obj2 = new Deer();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum((float)1.2, (float)2.0));
        System.out.println(obj.sum(2, 2 , 9));

        obj2.eat();  //deer class overrid for Animal
    }
}

class calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a , int b, int c){
        return a+b+c;
    }
}

//overriding

class Animal{
    void eat() {
        System.out.println("eat");
    }
}
class  Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}