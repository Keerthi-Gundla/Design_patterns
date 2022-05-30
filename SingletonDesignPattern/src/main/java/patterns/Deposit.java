package patterns;

public class Deposit {
    Account account=Account.getInstance();
    public void depositAmount(double amt){
        account.balance+=amt;
    }
}
