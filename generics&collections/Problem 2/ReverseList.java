import java.util.*;

class ReverseList {
    public static <T> void reverse(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}