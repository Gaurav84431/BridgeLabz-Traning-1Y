import java.util.*;
import java.util.stream.*;

class ClaimData {
    String type;
    double amount;

    ClaimData(String t, double a) {
        type = t;
        amount = a;
    }
}

public class ClaimApp {
    public static void main(String[] args) {
        List<ClaimData> list = Arrays.asList(
                new ClaimData("Health", 1000),
                new ClaimData("Health", 2000),
                new ClaimData("Car", 3000)
        );

        Map<String, Double> map = list.stream()
                .collect(Collectors.groupingBy(c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)));

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}