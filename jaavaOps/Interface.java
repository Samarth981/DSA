

public class Interface{
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.sakahariAnimal();
        b.masahariAnimal();
        b.run();

    }
}

interface ChessPlayer{
    void moves();   //bydefult public,abstract
}

//use interface 
class Queen implements ChessPlayer {
    //with implimentation
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements ChessPlayer {
    //with implimentation
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
    //with implimentation
    public void moves(){
        System.out.println("up,down,left,right,diagonal by one step");
    }
}

//mulitpal inheritance

interface sakahari {
    void sakahariAnimal();
    void masahariAnimal();
}

interface masahari{
    void run();
}

class Bear implements sakahari, masahari{
    public void sakahariAnimal(){
        System.out.println("bear is sakahari");
    }
    public void masahariAnimal(){
        System.out.println("bear is masahari");
    }
    public void run(){
        System.out.println("bear is run fast");
    }
}