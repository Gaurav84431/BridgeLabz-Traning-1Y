import java.util.*;

public class Marks {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "88", "null"};

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : inputs) {
            try {
                if (!s.equals("null"))
                    list.add(Integer.parseInt(s));
            } catch (Exception e) {}
        }

        int sum = 0;
        for (int i : list) sum += i;

        System.out.println("Average = " + (sum / list.size()));
    }
}