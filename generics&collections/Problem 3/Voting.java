import java.util.*;

class Voting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] votes = {"A", "B", "A", "C", "A", "B", "C", "B", "B", "A"};

        for (String v : votes) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        String winner = "";
        int max = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println(winner);
        System.out.println(map);
    }
}