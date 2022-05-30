package patterns;

public class BalanceEnquiry {
    Account account=Account.getInstance();

    public double getBalanceAmount(){
        return account.getBalance();
    }
}
