package com.Logistics_route_tracker;

abstract class Checkpoint {
    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;
    protected int expectedDuration;
    protected int actualDuration;

    public Checkpoint(String checkpointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}

class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "DeliveryCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2.0;
        }
        return 0.0;
    }
}

class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "FuelCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? 10.0 : 0.0;
    }
}

class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "RestCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        if (delay > 30) {
            return (delay - 30) * 0.5;
        }
        return 0.0;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class RouteLinkedList<T extends Checkpoint> {
    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        if (head == null) {
            head = new Node<>(checkpoint);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(checkpoint);
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.checkpointId.equals(checkpointId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.checkpointId.equals(checkpointId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.distanceFromLast;
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0.0;
        Node<T> current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public void printRoute() {
        Node<T> current = head;
        int index = 1;
        while (current != null) {
            T cp = current.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.printf("%d. %s - %s - %s - Penalty: %.1f\n",
                    index++, cp.getType(), cp.locationName, status, cp.calculatePenalty());
            current = current.next;
        }
    }

    public boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> current = head;
        while (current != null) {
            if (current.data.getType().equals("DeliveryCheckpoint")) hasDelivery = true;
            if (current.data.getType().equals("FuelCheckpoint")) hasFuel = true;
            current = current.next;
        }
        return hasDelivery && hasFuel;
    }
}

class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("\nRoute Summary:");
        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("\nTotal Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        String consistencyStatus = routeHistory.checkConsistency()
                ? "All required checkpoints present"
                : "Missing critical checkpoints";
        System.out.println("\nCritical Route Check: " + consistencyStatus);
    }
}

public class Logistics_route_tracker {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        Checkpoint cp1 = new DeliveryCheckpoint("CP1", "Warehouse A", 40.0, 30, 40);
        Checkpoint cp2 = new FuelCheckpoint("CP2", "Pump 12", 20.0, 15, 15);
        Checkpoint cp3 = new RestCheckpoint("CP3", "Motel X", 30.0, 60, 95);
        Checkpoint cp4 = new DeliveryCheckpoint("CP4", "Client Hub", 30.0, 45, 60);

        driver.routeHistory.addCheckpoint(cp1);
        driver.routeHistory.addCheckpoint(cp2);
        driver.routeHistory.addCheckpoint(cp3);
        driver.routeHistory.addCheckpoint(cp4);

        driver.printSummary();
    }
}