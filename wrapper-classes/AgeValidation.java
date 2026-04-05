public class AgeValidation {
    public static boolean isValid(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}