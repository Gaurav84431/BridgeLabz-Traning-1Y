import java.util.*;

public class QuotientRemainder {
    public static int[] find(int number, int divisor) {
        int q = number / divisor;
        int r = number % divisor;
        return new int[]{q, r};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] result = find(number, divisor);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
