import java.util.*;

class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> res = new HashMap<>();

        for (Map.Entry<K, V> e : map.entrySet()) {
            res.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return res;
    }
}