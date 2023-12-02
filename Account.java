public class Account {
        protected double balance;

        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
            return balance;
        }

        public void debit(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Debited: " + amount);
            } else {
                System.out.println("Insufficient funds");
            }
        }

        public void credit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Credited: " + amount);
            } else {
                System.out.println("Invalid credit amount");
            }
        }
    }

