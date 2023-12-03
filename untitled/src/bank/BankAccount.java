package bank;

public abstract class BankAccount {
    private String accountId;
    private Double balance;

    public BankAccount(String accountId, Double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    public String getAccountId() {
        return accountId;
    }

    public Double getBalance() {
        return balance;
    }

    //pour modifier le solde
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                '}';
    }

    //pour consulter la solde
    public Double consultBalance(){
        return getBalance();
    }

    //pour faire un dépôt
    public Double credit(Double amount){
        if (amount>0) {
            setBalance(getBalance()+amount);
            System.out.println("Success, dépôt réussi");
        }else {
            System.out.println("Error: amount must be sup than 0");
        }
        return getBalance();
    }

    //pour faire un retrait
    public Double debit(Double amount){
        if (amount<=getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("Success: votre compte à été débiter");
        }else {
            System.out.println("Error: votre solde est insuffisant");
        }
        return getBalance();
    }

    //pour les transfères d'argent vers un autre compte
    public Double transaction(Double amount, BankAccount receive){
        if (amount<=this.getBalance()){
            this.debit(amount);
            receive.credit(amount);
            System.out.println("Success: vous avez transférer "+amount+" à "+receive.getAccountId());
        }else {
            System.out.println("error");
        }
        return getBalance();
    }
}
