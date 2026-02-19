import java.util.*;

public class UniqueCharacters {

    public static int lengthOfString(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUnique(String str) {
        int len = lengthOfString(str);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index++] = ch;
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] result = findUnique(str);
        for (char c : result)
            System.out.print(c + " ");
    }
}
