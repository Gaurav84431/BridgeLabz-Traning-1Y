import java.util.*;

public class Q4 {
    static double cubeProduct(int n) {
        double product = 1;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) product *= Math.pow(i, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cubeProduct(n));
    }
}
