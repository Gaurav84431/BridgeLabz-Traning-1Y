import java.util.*;

class DoctorData {
    String name;
    String specialty;
    boolean weekend;

    DoctorData(String n, String s, boolean w) {
        name = n;
        specialty = s;
        weekend = w;
    }
}

public class DoctorApp {
    public static void main(String[] args) {
        List<DoctorData> list = Arrays.asList(
                new DoctorData("A", "Cardio", true),
                new DoctorData("B", "Neuro", false),
                new DoctorData("C", "Ortho", true)
        );

        list.stream()
                .filter(d -> d.weekend)
                .sorted((a, b) -> a.specialty.compareTo(b.specialty))
                .forEach(d -> System.out.println(d.name + " " + d.specialty));
    }
}