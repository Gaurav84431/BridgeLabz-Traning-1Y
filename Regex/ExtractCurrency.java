import java.util.regex.*;

class ExtractCurrency {
    public static void main(String[] args) {
        String text = "Price is $45.99 and discount 10.50";
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d+").matcher(text);
        while (m.find()) System.out.println(m.group());
    }
}