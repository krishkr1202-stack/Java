class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit failed: Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be greater than zero.");
        } else if (amount > this.balance) {
            System.out.println("Withdrawal failed: Insufficient balance.");
        } else {
            this.balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + this.accountHolder + ", Account Number: " + this.accountNumber + ", Balance: " + this.balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Krish", "ACC12345", 5000.0);
        
        System.out.println("Initial Account Status:");
        myAccount.displayAccountDetails();

        System.out.println("\n--- Testing Valid Transactions ---");
        myAccount.deposit(2000.0);
        myAccount.withdraw(1500.0);
        myAccount.displayAccountDetails();

        System.out.println("\n--- Testing Invalid Transactions ---");
        myAccount.deposit(-500.0);
        myAccount.withdraw(0.0);
        myAccount.withdraw(20000.0);
        
        System.out.println("\nFinal Account Status:");
        myAccount.displayAccountDetails();
    }
}
