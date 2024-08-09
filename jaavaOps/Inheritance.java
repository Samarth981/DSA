
import java.awt.Color;

class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
        shark.breath();
    }
}

//parent class
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

//child or derive class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}