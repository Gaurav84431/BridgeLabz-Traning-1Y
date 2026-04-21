import java.util.*;

class ProductData {
    String name;
    double price;

    ProductData(String n, double p) {
        name = n;
        price = p;
    }
}

public class ProductSortApp {
    public static void main(String[] args) {
        List<ProductData> list = Arrays.asList(
                new ProductData("A", 300),
                new ProductData("B", 100)
        );

        list.sort((a, b) -> Double.compare(a.price, b.price));

        list.forEach(p -> System.out.println(p.name + " " + p.price));
    }
}