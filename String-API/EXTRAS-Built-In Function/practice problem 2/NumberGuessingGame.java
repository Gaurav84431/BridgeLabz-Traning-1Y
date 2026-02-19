import java.util.*;

public class NumberGuessingGame {
    static int generateGuess(int low, int high) {
        return low + new Random().nextInt(high - low + 1);
    }

    static String getFeedback(Scanner sc) {
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "? (high/low/correct)");
            feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Number guessed successfully");
    }
}
