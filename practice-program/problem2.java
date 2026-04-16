import java.util.*;

public class problem2 {
    
    static int sumOfDivisors(int n) {
        int sum = 1;
        if (n == 1) return 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if (sum1 * num2 == sum2 * num1) {
            System.out.println("Yes, they are a friendly pair");
        } else {
            System.out.println("No, they are not a friendly pair");
        }
    }
}