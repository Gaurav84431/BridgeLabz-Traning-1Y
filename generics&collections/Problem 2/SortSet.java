import java.util.*;

class SortSet {
    public static List<Integer> sort(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}