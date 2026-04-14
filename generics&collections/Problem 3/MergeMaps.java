import java.util.*;

class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> res = new HashMap<>(m1);

        for (Map.Entry<String, Integer> e : m2.entrySet()) {
            res.put(e.getKey(), res.getOrDefault(e.getKey(), 0) + e.getValue());
        }
        return res;
    }
}