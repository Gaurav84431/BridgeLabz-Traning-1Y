import java.util.*;

public class Program7 {
    static String trimCustom(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ')
            start++;
        while (end >= start && s.charAt(end) == ' ')
            end--;
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = trimCustom(s);
        String b = s.trim();
        System.out.println(a);
        System.out.println(a.equals(b));
    }
}
