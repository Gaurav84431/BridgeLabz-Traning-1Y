import java.util.*;

public class NameTransformApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "aman");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}