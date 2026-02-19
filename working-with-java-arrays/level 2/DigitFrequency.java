import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();

        int[] frequency = new int[10];

        while (num != 0) {
            int digit = (int)(num % 10);
            frequency[digit]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0)
                System.out.println(i + " -> " + frequency[i]);
        }
    }
}
