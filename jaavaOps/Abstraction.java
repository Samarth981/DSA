public class Abstraction{
    public static void main(String[] args) {
        Chicken c = new Chicken(); 
        c.eat();
        c.walk();

        Hours h = new Hours();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Mustang m = new Mustang();
        //Animal class -> Hours class -> Mustang class
        //cunstructor calling
    }
}

abstract class Animal{
    //non abstract 
    void eat(){
        System.out.println("eat");
    }

    //with abstract
    abstract void walk();  
    //not depend on Animal

    //creat constructor
    String color;
    Animal(){  
        // color = "brown";  //if not apply change color then by default brow
        System.out.println("Animal constructor is call"); 
    }
}


class Chicken extends Animal{

    void changeColor(){
        // color = "white";
        System.out.println("Chicken constructor is call");
    }
    void walk(){ //implimetation
        System.out.println("walk on 2 legs");
    }
}

class Hours extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){ //implimetation
        System.out.println("walk on 4 legs");
    }
    Hours(){ //constructr
        System.out.println("Hours constructor is call");
    }
}

class Mustang extends Hours{
    Mustang(){
        System.out.println("Mustang constructr is call");
    }
}