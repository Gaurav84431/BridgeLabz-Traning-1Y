class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public void display() {
        System.out.println(accountNumber + " " + accountHolder + " " + getBalance());
    }
}

public class Main3 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 1001;
        s.accountHolder = "Arvind";
        s.setBalance(5000);
        s.display();
    }
}