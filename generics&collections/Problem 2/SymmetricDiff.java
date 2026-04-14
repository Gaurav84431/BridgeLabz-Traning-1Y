import java.util.*;

class SymmetricDiff {
    public static <T> Set<T> diff(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        Set<T> temp = new HashSet<>(a);
        temp.retainAll(b);
        result.removeAll(temp);
        return result;
    }
}