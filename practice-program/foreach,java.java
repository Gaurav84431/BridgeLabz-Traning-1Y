public class foreach {
    public static void main (String [] args) {
        int arr[] = {10,20,30,40};
        for (int num: arr) {
            if (num == 20) {
                System.out.println("Skipped");
                continue;
            }
            System.out.println(num);
        }
    }
}