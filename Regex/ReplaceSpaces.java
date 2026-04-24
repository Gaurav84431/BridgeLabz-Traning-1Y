class ReplaceSpaces {
    public static void main(String[] args) {
        String s = "This   is   test";
        System.out.println(s.replaceAll("\\s+", " "));
    }
}