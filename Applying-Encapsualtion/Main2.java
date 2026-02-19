import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() { return getPrice() * 0.1; }

    public double calculateTax() { return getPrice() * 0.18; }

    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() { return getPrice() * 0.05; }

    public double calculateTax() { return getPrice() * 0.12; }

    public String getTaxDetails() { return "12% GST"; }
}

class Groceries extends Product implements Taxable {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() { return getPrice() * 0.02; }

    public double calculateTax() { return getPrice() * 0.05; }

    public String getTaxDetails() { return "5% GST"; }
}

class Main2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Electronics(1, "Laptop", 50000));
        list.add(new Clothing(2, "Shirt", 2000));

        for (Product p : list) {
            Taxable t = (Taxable) p;
            double finalPrice = p.getPrice() + t.calculateTax() - p.calculateDiscount();
            System.out.println(p.getName() + " " + finalPrice);
        }
    }
}