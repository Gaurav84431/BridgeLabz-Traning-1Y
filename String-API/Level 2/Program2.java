import java.util.*;

public class Program2 {
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

    static String[] splitText(String s) {
        int len = findLength(s);
        int words = 1;
        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ')
                words++;
        String[] arr = new String[words];
        int start = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                arr[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        arr[index] = s.substring(start, len);
        return arr;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] user = splitText(s);
        String[] built = s.split(" ");
        System.out.println(compare(user, built));
    }
}
