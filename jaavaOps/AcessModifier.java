public class AcessModifier{ //use for public that's why all are access
    
    public static void main(String args[]){
        BankAcount myAcc = new BankAcount();
        myAcc.username = "samarth";
        // myAcc.password = "avbcclkf"; //can not be access this 
        myAcc.setPassword("andhdd");
        

        myAcc.setgooglepwd("samarth");
        System.out.println(myAcc.getpwd());

    }
}

class BankAcount{
    public String username; 
    private String password;
    private String googlePay;


    public void setPassword(String pwd){
        password = pwd; //this is accessable because it access in class 
    }

    //gat and set
    //this is use for if give access for private modifay

    void setgooglepwd(String pwd){
        this.googlePay = pwd; 
    }
    String getpwd(){
        return this.googlePay;
    }
}