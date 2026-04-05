import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1000000;

        // Array
        int[] arr = new int[n];
        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) arr[i] = i;

        long sum = 0;
        for (int i : arr) sum += i;

        long end = System.currentTimeMillis();
        System.out.println("Array time: " + (end - start));

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) list.add(i);

        sum = 0;
        for (int i : list) sum += i;

        end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start));
    }
}