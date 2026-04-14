abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    private java.util.List<T> list = new java.util.ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void displayAll(java.util.List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) {
            System.out.println(i.getClass().getSimpleName());
        }
    }
}