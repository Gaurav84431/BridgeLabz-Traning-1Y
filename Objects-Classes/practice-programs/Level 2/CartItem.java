class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
        } else {
            System.out.println("Not enough quantity to remove");
        }
    }

    void displayTotal() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem("Book", 200);
        c1.addItem(3);
        c1.removeItem(1);
        c1.displayTotal();
    }
}
