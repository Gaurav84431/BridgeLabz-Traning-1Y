import java.util.*;

public class Program4 {
    static String[] splitText(String s) {
        String[] arr = s.split(" ");
        return arr;
    }

    static String[] shortestLongest(String[] arr) {
        String min = arr[0], max = arr[0];
        for (String w : arr) {
            if (w.length() < min.length())
                min = w;
            if (w.length() > max.length())
                max = w;
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = splitText(s);
        String[] res = shortestLongest(words);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
