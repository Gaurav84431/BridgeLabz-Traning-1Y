import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }
    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() { return 200; }
    public String getInsuranceDetails() { return "Bike Insurance"; }
}

class Main3 {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Car("UP32A1", 1000));
        list.add(new Bike("UP32B2", 500));

        for (Vehicle v : list) {
            Insurable i = (Insurable) v;
            System.out.println(v.calculateRentalCost(3) + i.calculateInsurance());
        }
    }
}