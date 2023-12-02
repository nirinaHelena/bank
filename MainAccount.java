public class MainAccount extends Account{
        public MainAccount(double initialBalance) {
            super(initialBalance);
        }
        public void loan(Integer amount){
            if (amount>0){
                setBalance(getBalance()+amount);
            }
        }
}
