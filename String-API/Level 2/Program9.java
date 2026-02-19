import java.util.*;

public class Program9 {
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r==0?"Rock":r==1?"Paper":"Scissors";
    }

    static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("Rock") && comp.equals("Scissors")) return "User";
        if (user.equals("Paper") && comp.equals("Rock")) return "User";
        if (user.equals("Scissors") && comp.equals("Paper")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int userWins = 0, compWins = 0;
        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String w = winner(user, comp);
            if (w.equals("User")) userWins++;
            if (w.equals("Computer")) compWins++;
            System.out.println(user + " " + comp + " " + w);
        }
        System.out.println((userWins*100.0)/n);
        System.out.println((compWins*100.0)/n);
    }
}

