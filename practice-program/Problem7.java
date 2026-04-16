public class Problem7 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 9};

        boolean isSubset = true;

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("Subset");
        } else {
            System.out.println("Not a Subset");
        }
    }
}