import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int index = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            try {
                int value = arr[index];
                int result = value / divisor;
                System.out.println(result);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}