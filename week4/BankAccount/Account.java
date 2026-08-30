public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0);
    }

    public Account(String accountNumber, String ownerName, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Opening balance cannot be negative");
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = openingBalance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }

    public String toString() {
        return "Account{number='" + accountNumber + "', owner='" + ownerName + "', balance=" + balance + "}";
    }
}
