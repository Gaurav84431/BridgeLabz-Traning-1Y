class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class AnimalUtil {
    public static void printAnimals(java.util.List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
        }
    }
}