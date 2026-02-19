class ProductGenerator {

    public static String generate(String title, String sku) {
        StringBuilder sb = new StringBuilder();

        sb.append("<h1>").append(title).append("</h1>");
        sb.append("<p>SKU: ").append(sku).append("</p>");
        sb.append("<h2>Specifications</h2><ul>");
        sb.append("<li>Spec 1</li>");
        sb.append("<li>Spec 2</li>");
        sb.append("<li>Spec 3</li>");
        sb.append("<li>Spec 4</li>");
        sb.append("<li>Spec 5</li>");
        sb.append("</ul>");
        sb.append("<h2>Features</h2><ul>");
        sb.append("<li>Feature A</li>");
        sb.append("<li>Feature B</li>");
        sb.append("<li>Feature C</li>");
        sb.append("<li>Feature D</li>");
        sb.append("</ul>");
        sb.append("<p>Price: $1000 | Discount: 10% | Final: $900</p>");
        sb.append("<p>Availability: In Stock</p>");

        int words = sb.toString().split("\\s+").length;
        int time = words / 200;

        sb.append("<p>Reading Time: ").append(time).append(" min</p>");
        sb.append("<p>Description Length: ").append(sb.length()).append("</p>");

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate("Gaming Laptop","LAP123"));
        System.out.println(generate("Winter Jacket","JAC456"));
        System.out.println(generate("Coffee Maker","COF789"));
    }
}
