import java.util.*;

public class Chocolates {
    public static int[] distribute(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = distribute(chocolates, children);
        System.out.println("Each Child Gets: " + result[0]);
        System.out.println("Remaining Chocolates: " + result[1]);
    }
}
