import java.time.*;
import java.util.*;

class GymMember {
    String name;
    LocalDate expiry;

    GymMember(String n, LocalDate e) {
        name = n;
        expiry = e;
    }
}

public class MembershipApp {
    public static void main(String[] args) {
        List<GymMember> list = Arrays.asList(
                new GymMember("A", LocalDate.now().plusDays(10)),
                new GymMember("B", LocalDate.now().plusDays(40))
        );

        list.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}