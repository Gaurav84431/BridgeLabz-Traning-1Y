import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int min = Math.min(s1.length(), s2.length());
        int result = 0;

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (result == 0)
            result = s1.length() - s2.length();

        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s2 + " comes before " + s1);
        else
            System.out.println("Both are equal");
    }
}
