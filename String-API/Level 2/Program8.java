import java.util.*;

public class Program8 {
    static int[] generateAges(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = 10 + (int)(Math.random() * 90);
        return arr;
    }

    static String[][] check(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = ages[i] >= 18 ? "Can Vote" : "Cannot Vote";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] res = check(ages);
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i][0] + " " + res[i][1]);
    }
}
