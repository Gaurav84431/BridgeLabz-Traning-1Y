import java.util.regex.*;

class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, JavaScript and Go";
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}