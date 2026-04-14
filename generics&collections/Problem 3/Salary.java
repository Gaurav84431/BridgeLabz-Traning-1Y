import java.util.*;

class Salary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A", 50000.0);
        map.put("B", 60000.0);

        map.put("A", map.get("A") * 1.1);

        double sum = 0, max = 0;
        String name = "";

        for (Map.Entry<String, Double> e : map.entrySet()) {
            sum += e.getValue();
            if (e.getValue() > max) {
                max = e.getValue();
                name = e.getKey();
            }
        }

        System.out.println(sum / map.size());
        System.out.println(name);
    }
}