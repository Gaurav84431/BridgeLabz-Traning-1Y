class CensorWords {
    public static void main(String[] args) {
        String s = "This is a damn bad example with stupid words";
        System.out.println(s.replaceAll("damn|stupid", "****"));
    }
}