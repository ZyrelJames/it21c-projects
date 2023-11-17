public class BankAccount {
    private String name;
    private int age;
    private long accountNumber;
    private double balance;

    public BankAccount(String name, int age, long accountNumber, double balance) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void displayAccountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("ZyrelJames", 19, 229387454, 2000.0);
    
        myAccount.deposit(400.0);
        myAccount.deposit(400.0);
     
        myAccount.displayAccountSummary();
    }
}