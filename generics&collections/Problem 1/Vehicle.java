class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    private java.util.List<T> list = new java.util.ArrayList<>();

    public void addVehicle(T v) {
        list.add(v);
    }

    public void showFleet() {
        for (T v : list) {
            System.out.println(v.getClass().getSimpleName());
        }
    }
}