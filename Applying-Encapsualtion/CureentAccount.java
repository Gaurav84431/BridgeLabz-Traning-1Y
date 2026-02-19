abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() { return balance * 0.04; }

    public void applyForLoan(double amount) { System.out.println("Loan Applied: " + amount); }

    public boolean calculateLoanEligibility() { return balance > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() { return balance * 0.02; }

    public void applyForLoan(double amount) { System.out.println("Loan Applied: " + amount); }

    public boolean calculateLoanEligibility() { return balance > 10000; }
}