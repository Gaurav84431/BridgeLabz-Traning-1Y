import java.util.*;

class StudentGrade {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();

        map.put("Aman", 85.0);
        map.put("Ravi", 90.0);
        map.put("Neha", 78.0);

        map.put("Aman", 88.0);
        map.remove("Neha");

        for (Map.Entry<String, Double> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}