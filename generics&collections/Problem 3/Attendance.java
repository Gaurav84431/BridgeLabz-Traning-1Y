import java.util.*;

class Attendance {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] students = {"A", "B", "C", "D", "E"};

        for (String s : students) map.put(s, 0);

        String[][] days = {
            {"A","B"}, {"A","C"}, {"B","D"}, {"A","E"}, {"C","D"}
        };

        for (String[] day : days) {
            for (String s : day) {
                map.put(s, map.get(s) + 1);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) < 3) System.out.println(s);
        }
    }
}