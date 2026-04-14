import java.util.*;

class MaxKey {
    public static String find(Map<String, Integer> map) {
        String key = null;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                key = e.getKey();
            }
        }
        return key;
    }
}