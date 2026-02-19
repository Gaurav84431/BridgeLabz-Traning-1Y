import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10",
                          "Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) return null;

        String[][] result = new String[players][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cardsPerPlayer = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        String[][] distributed = distribute(deck, players, cardsPerPlayer);

        if (distributed == null) {
            System.out.println("Not enough cards");
            return;
        }

        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < distributed[i].length; j++) {
                System.out.println(distributed[i][j]);
            }
            System.out.println();
        }
    }
}
