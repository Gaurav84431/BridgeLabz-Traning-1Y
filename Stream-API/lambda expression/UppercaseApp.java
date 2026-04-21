import java.util.*;

public class UppercaseApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}