import java.util.Scanner;

public class Program1 {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len1 = findLength(s);
        int len2 = s.length();
        System.out.println(len1);
        System.out.println(len2);
    }
}
