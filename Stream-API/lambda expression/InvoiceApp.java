import java.util.*;
import java.util.stream.*;

class InvoiceData {
    int id;

    InvoiceData(int id) {
        this.id = id;
    }
}

public class InvoiceApp {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3);

        List<InvoiceData> list = ids.stream()
                .map(InvoiceData::new)
                .collect(Collectors.toList());

        list.forEach(i -> System.out.println(i.id));
    }
}