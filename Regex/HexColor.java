class HexColor {
    public static void main(String[] args) {
        String s = "#FFA500";
        System.out.println(s.matches("^#[0-9A-Fa-f]{6}$"));
    }
}