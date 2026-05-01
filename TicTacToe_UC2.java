import java.util.Random;

public class TicTacToe_UC2 {

    public static void main(String[] args) {

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        Random random = new Random();

        // Toss (0 or 1)
        int toss = random.nextInt(2);

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
        }

        System.out.println("Toss Result:");
        System.out.println(player1 + " is " + player1Symbol);
        System.out.println(player2 + " is " + player2Symbol);
        System.out.println(currentPlayer + " will start the game.");
    }
}