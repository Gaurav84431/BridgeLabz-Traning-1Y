import java.util.*;

public class Program3 {
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

    static String[][] withLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitText(s);
        String[][] data = withLength(words);
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + " " + Integer.parseInt(data[i][1]));
    }
}
