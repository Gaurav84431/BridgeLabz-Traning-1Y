import java.util.*;

class WordFrequency {
    public static Map<String, Integer> count(String text) {
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (!w.isEmpty())
                map.put(w, map.getOrDefault(w, 0) + 1);
        }
        return map;
    }
}