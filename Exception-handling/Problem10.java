import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount < 0) {
            throw new IllegalArgumentException();
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000);

        try {
            double amount = sc.nextDouble();
            acc.withdraw(amount);
        } catch(InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}