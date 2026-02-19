import java.util.*;

public class FirstNonRepeating {

    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        for (int i = 0; i < str.length(); i++)
            if (freq[str.charAt(i)] == 1)
                return str.charAt(i);

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char result = findFirstNonRepeating(str);
        System.out.println(result);
    }
}
