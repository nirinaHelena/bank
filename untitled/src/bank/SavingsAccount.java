package bank;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountId, Double balance) {
        super(accountId, balance);
    }
    private Double interestRate=2.0;
    public void calculInterest(){
        double interest= getBalance()*(interestRate/100);
        credit(interest);
        System.out.println("intérêts calculés, nouveau solde: "+getBalance());
    }
}
