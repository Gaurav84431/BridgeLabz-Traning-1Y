class SumUtil {
    public static double sumNumbers(java.util.List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}