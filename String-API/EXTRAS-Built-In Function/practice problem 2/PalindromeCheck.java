import java.util.*;

public class PalindromeCheck {
    static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
