public class BankAccount {
    public static void main(String[] args) {
        Account first = new Account("A1001", "Asha");
        Account second = new Account("A1002", "Ravi", 500);
        System.out.println(first.deposit(200));
        System.out.println(first.deposit(0));
        System.out.println(first.deposit(-50));
        System.out.println(first.withdraw(100));
        System.out.println(first.withdraw(500));
        System.out.println(first);
        System.out.println(second.withdraw(300));
        System.out.println(second);
    }
}
