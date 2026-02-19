import java.util.*;

public class FrequencyUsingUnique {

    public static char[] findUnique(String str) {
        char[] temp = new char[str.length()];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        char[] unique = findUnique(str);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[][] result = findFrequency(str);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + " " + result[i][1]);
    }
}
