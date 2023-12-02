public class MobileAccount extends Account {
        public MobileAccount(double initialBalance) {
            super(initialBalance);
        }
        public void loan(Integer amount){
            if (amount>0){
                setBalance(getBalance()+amount);
            }
        }
}
