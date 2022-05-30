package patterns;

public class Account {

    private static Account account;
    public double balance;
    private Account(){
        balance=0.0;
    }

    public static Account getInstance(){
        if(account==null){
            account=new Account();
        }
        return account;
    }

    public double getBalance() {
        return balance;
    }
}
