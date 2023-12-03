package bank;

public class TestMethod {
    public static void main(String[] args) {
        //Test main account
        System.out.println("Test le compte principal");
        MainAccount mainAccount= new MainAccount("1", 0.0);
        System.out.println("id: "+mainAccount.getAccountId());
        System.out.println("balance: "+ mainAccount.consultBalance());
        //créditer une valeur 200.0 à la balance
        mainAccount.credit(200.0);
        System.out.println("balance credit de 200.0: "+ mainAccount.consultBalance());
        //débiter une valeur de 2.0 à la balance
        mainAccount.debit(2.0);
        System.out.println("balance débiter de 2.0: "+ mainAccount.consultBalance());

        //Test saving account
        System.out.println("Test saving account");
        SavingsAccount savingsAccount= new SavingsAccount("2", 0.0);
        System.out.println("id:"+ savingsAccount.getAccountId());
        System.out.println("balance: "+ savingsAccount.consultBalance());
        //Test transaction
        System.out.println("Test transaction");
        mainAccount.transaction(100.0, savingsAccount);
        System.out.println("mainAccount envoi 100.0 à savings account");
        System.out.println("balance de main account:"+ mainAccount.consultBalance());
        System.out.println("balance de saving account: "+ savingsAccount.consultBalance());

        // Test not enough money
        System.out.println("test transaction saving envoie 200.0 à main");
        savingsAccount.transaction(200.0, mainAccount);
    }
}
