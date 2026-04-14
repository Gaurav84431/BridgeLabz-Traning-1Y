import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

class GroupByDept {
    public static Map<String, List<Employee>> group(List<Employee> list) {
        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            map.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        }
        return map;
    }
}