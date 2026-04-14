import java.util.*;

class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");

        String country = "India";
        System.out.println(map.getOrDefault(country, "Unknown country"));

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}