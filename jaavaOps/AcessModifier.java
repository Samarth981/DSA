public class AcessModifier{ //use for public that's why all are access
    
    public static void main(String args[]){
        BankAcount myAcc = new BankAcount();
        myAcc.username = "samarth";
        // myAcc.password = "avbcclkf"; //can not be access this 
        myAcc.setPassword("andhdd");
    }
}

class BankAcount{
    public String username; 
    private String password;

    public void setPassword(String pwd){
        password = pwd; //this is accessable because it access in class 
    }
}