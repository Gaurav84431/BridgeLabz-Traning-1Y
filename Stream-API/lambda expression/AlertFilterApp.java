import java.util.*;
import java.util.function.*;

public class AlertFilterApp {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Critical", "Normal");

        Predicate<String> filter = a -> a.equals("Critical");

        alerts.stream()
                .filter(filter)
                .forEach(System.out::println);
    }
}