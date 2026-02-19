import java.util.*;

public class Q2 {
    static int sumFactors(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumFactors(n));
    }
}
