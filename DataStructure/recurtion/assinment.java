public class assinment{

//Q-5 Taver of Hanoi
//print step to move n number of disk frome using A  to C 
public static void taverOfHanoi(int n, char A , char C, char B){     //A(currnt),B(helper),C(destination) is a road
    //base
    if(n == 0){
        return; 
    }
    //first work recirtion
    taverOfHanoi(n-1, A, B, C);       // A -> B using C(helper)

    System.out.println("moving disc " + n + " from " + A + " to " + C);

    taverOfHanoi(n-1, B, C, A);       // B->C using A(helper)

    }

    public static void main(String args[]){
        int n;
        taverOfHanoi(3, 'A', 'C', 'B');
    }
    
}


