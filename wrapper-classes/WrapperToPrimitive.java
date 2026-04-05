public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double d = dObj;        
        int i = (int) dObj.doubleValue(); 

        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);
    }
}