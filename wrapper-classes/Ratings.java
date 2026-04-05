import java.util.*;

public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> merged = new ArrayList<>();

        for (int i : arr) merged.add(i);

        for (Integer i : list) {
            if (i != null) merged.add(i);
        }

        double sum = 0;
        for (int i : merged) sum += i;

        System.out.println("Average = " + sum / merged.size());
    }
}