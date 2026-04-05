public class Sensor {
    public static void process(double value) {
        Double obj = value; // boxing
        double val = obj;   // unboxing

        System.out.println("Stored: " + obj);
        System.out.println("Read: " + val);
    }
}