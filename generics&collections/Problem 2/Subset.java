import java.util.*;

class Subset {
    public static <T> boolean isSubset(Set<T> a, Set<T> b) {
        return b.containsAll(a);
    }
}