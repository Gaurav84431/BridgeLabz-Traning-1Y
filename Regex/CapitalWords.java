import java.util.regex.*;

class CapitalWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris";
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}