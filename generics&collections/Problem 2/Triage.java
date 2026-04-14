import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

class Triage {
    public static void process(List<Patient> patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (a, b) -> b.severity - a.severity
        );

        pq.addAll(patients);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }
}