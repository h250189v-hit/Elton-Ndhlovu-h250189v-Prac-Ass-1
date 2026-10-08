public class CurrentAccount extends Account {
    private double overdraftLimit;
    private double monthlyFee = 50.00;
    public CurrentAccount(String accountNumber, double balance,
                          double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
        else if (balance - amount < -overdraftLimit) {
            System.out.println("Withdrawal rejected. "
                    + "The overdraft limit has been exceeded.");
        }
        else {
            balance -= amount;
            System.out.println("Current account withdrawal successful: $"
                    + amount);

            if (balance < 0) {
                System.out.println("Account is now in overdraft.");
            }
        }
    }
    @Override
    public void endOfMonth() {

        balance -= monthlyFee;

        System.out.println("Monthly maintenance fee of $"
                + monthlyFee + " deducted.");
    }
}