class LicensePlate {
    public static void main(String[] args) {
        String s = "AB1234";
        System.out.println(s.matches("^[A-Z]{2}[0-9]{4}$"));
    }
}