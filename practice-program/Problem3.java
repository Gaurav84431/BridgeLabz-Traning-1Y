import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String result = String.valueOf(num).replace('0', '1');

        System.out.println(result);
    }
}