import java.util.*;

public class ContactParser {
    public static void main(String[] args) {
        String data = "John Doe;+1-555-0101;john@email.com;123 Main St, NYC\n"
                + "Jane Smith;+1-555-0102;jane@email.com;456 Oak Ave, LA\n"
                + "Mike Ross;+1-555-0103;mike@email.com;789 Pine Rd, TX\n"
                + "Rachel Zane;+1-555-0104;rachel@email.com;101 Maple St, NJ\n"
                + "Harvey Specter;+1-555-0105;harvey@email.com;202 Wall St, NY";

        StringTokenizer contacts = new StringTokenizer(data, "\n");
        int count = 0;

        while (contacts.hasMoreTokens()) {
            String line = contacts.nextToken();
            StringTokenizer fields = new StringTokenizer(line, ";");

            String name = fields.hasMoreTokens() ? fields.nextToken() : "";
            String phone = fields.hasMoreTokens() ? fields.nextToken() : "";
            String email = fields.hasMoreTokens() ? fields.nextToken() : "";
            String address = fields.hasMoreTokens() ? fields.nextToken() : "";

            System.out.println("----- Contact Card -----");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
            System.out.println("Address: " + address);
            count++;
        }

        System.out.println("Total Contacts: " + count);
    }
}
