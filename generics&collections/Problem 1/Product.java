class Product {
    double price;
    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {}
class Laptop extends Product {}

class PriceUtil {
    public static double calculateTotal(java.util.List<? extends Product> items) {
        double sum = 0;
        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }
}