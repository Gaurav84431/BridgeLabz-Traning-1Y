import java.util.*;

public class NumberCheck {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 1) System.out.println("First is Greater");
        else if (result == -1) System.out.println("First is Smaller");
        else System.out.println("Both are Equal");
    }
}
