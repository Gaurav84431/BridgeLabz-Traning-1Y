import java.util.*;

public class Program6 {
    static String type(char c) {
        if (!Character.isLetter(c))
            return "Not Letter";
        c = Character.toLowerCase(c);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return "Vowel";
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i) + " " + type(s.charAt(i)));
    }
}
