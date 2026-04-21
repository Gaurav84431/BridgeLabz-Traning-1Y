import java.util.*;

public class WelcomeApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "C");
        names.forEach(n -> System.out.println("Welcome " + n));
    }
}