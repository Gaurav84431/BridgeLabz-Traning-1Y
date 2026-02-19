import java.util.*;

public class BasicCalculator {
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (choice == 1)
            System.out.println(add(a, b));
        else if (choice == 2)
            System.out.println(sub(a, b));
        else if (choice == 3)
            System.out.println(mul(a, b));
        else if (choice == 4)
            System.out.println(div(a, b));
    }
}
