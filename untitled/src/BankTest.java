public class BankTest {
    public static void main(String[] args) {
        // Example usage
        MobileAccount mobileAccount = new MobileAccount(1000);
        SavingAccount savingsAccount = new SavingAccount(5000);
        MainAccount mainAccount = new MainAccount(10000);

        // Perform transactions
        mobileAccount.debit(200);
        mobileAccount.credit(300);

        savingsAccount.debit(1000);
        savingsAccount.credit(1500);

        mainAccount.debit(500);
        mainAccount.credit(1000);

        // Check balances
        System.out.println("Mobile Account Balance: " + mobileAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Main Account Balance: " + mainAccount.getBalance());
    }
}
