class ProductCategory {}

class ProductGen<T extends ProductCategory> {
    T category;
    double price;

    public ProductGen(T category, double price) {
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Discount {
    public static <T extends ProductGen<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * percentage / 100;
    }
}