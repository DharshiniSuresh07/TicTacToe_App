import java.util.Scanner;

public class TicTacToe_UC2{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose X or O: ");
        char player = scanner.next().charAt(0);

        if (player != 'X' && player != 'O') {
            System.out.println("Invalid choice. Defaulting to X.");
            player = 'X';
        }

        System.out.println("Player chose: " + player);
    }
}