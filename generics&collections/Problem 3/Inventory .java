import java.util.*;

class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Milk", 10);
        map.put("Bread", 5);

        map.put("Milk", map.get("Milk") - 3);

        map.put("Bread", map.getOrDefault("Bread", 0) + 10);

        System.out.println(map.getOrDefault("Butter", 0));

        for (String k : map.keySet()) {
            if (map.get(k) <= 0) System.out.println(k);
        }
    }
}