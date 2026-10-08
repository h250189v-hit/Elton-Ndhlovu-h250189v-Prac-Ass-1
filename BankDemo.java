import java.util.ArrayList;
import java.util.List;
public class BankDemo {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S001", 2000, 500));
        accounts.add(new CurrentAccount("C001", 1000, 1000));
        accounts.add(new SavingsAccount("S002", 1500, 500));
        accounts.add(new CurrentAccount("C002", 500, 1000));
        System.out.println("===== BANK ACCOUNT DEMO =====");
        for (Account account : accounts) {
            System.out.println("\nAccount: " + account.accountNumber);
            System.out.println("Starting balance: $" + account.getBalance());
            account.withdraw(1800);
            System.out.println("Balance after withdrawal: $" + account.getBalance());
            account.endOfMonth();
            System.out.println("Balance after month-end: $" + account.getBalance());
        }
        System.out.println("\n===== SAVINGS ACCOUNT TEST =====");
        Account savings = new SavingsAccount("S003", 1000, 500);
        System.out.println("Starting balance: $" + savings.getBalance());
        savings.withdraw(600);
        System.out.println("Balance: $" + savings.getBalance());
        System.out.println("\n===== CURRENT ACCOUNT TEST =====");
        Account current = new CurrentAccount("C003", 500, 1000);
        System.out.println("Starting balance: $" + current.getBalance());
        current.withdraw(800);
        System.out.println("Balance: $" + current.getBalance());
    }
}