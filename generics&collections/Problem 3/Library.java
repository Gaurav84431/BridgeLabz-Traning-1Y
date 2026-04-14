import java.util.*;

class Library {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("101", "Java");
        map.put("102", "DSA");

        System.out.println(map.getOrDefault("103", "Book not found"));

        map.remove("101");

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        String title = "DSA";
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (e.getValue().equals(title)) System.out.println(e.getKey());
        }
    }
}