import java.util.*;

class CourseReg {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 60);
        map.put("MA101", 3);

        map.put("CS101", map.get("CS101") + 5);
        map.put("MA101", Math.max(0, map.get("MA101") - 2));

        for (String k : map.keySet()) {
            if (map.get(k) >= 50) System.out.println("Full: " + k);
            if (map.get(k) < 5) System.out.println("Low: " + k);
        }
    }
}