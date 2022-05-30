package patterns;

public class Withdraw {
    Account account=Account.getInstance();
    public void withdrawAmount(double amt){
        if(account.balance>=amt)
            account.balance-=amt;
        else
            System.out.println("Insufficient Balance");
    }
}
