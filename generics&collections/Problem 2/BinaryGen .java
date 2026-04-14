import java.util.*;

class BinaryGen {
    public static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.poll();
            result.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return result;
    }
}