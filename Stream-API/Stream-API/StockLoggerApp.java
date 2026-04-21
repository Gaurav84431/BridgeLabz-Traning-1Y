import java.util.*;

public class StockLoggerApp {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(100.5, 200.7, 150.2);
        prices.forEach(System.out::println);
    }
}