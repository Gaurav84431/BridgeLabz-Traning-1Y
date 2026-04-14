class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    private java.util.List<T> list = new java.util.ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void display() {
        for (T f : list) {
            System.out.println(f.getClass().getSimpleName());
        }
    }
}