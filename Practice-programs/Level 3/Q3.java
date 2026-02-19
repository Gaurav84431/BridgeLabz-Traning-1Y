import java.util.*;

public class Q3 {
    static int productFactors(int n) {
        int product = 1;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(productFactors(n));
    }
}
