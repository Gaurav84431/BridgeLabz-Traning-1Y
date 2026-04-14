class CopyUtil {
    public static void copyList(java.util.List<? super Number> dest, java.util.List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }
}