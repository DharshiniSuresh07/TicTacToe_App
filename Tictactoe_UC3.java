import java.util.Scanner;

public class TicTacToe_UC3 {

    // Method to get user slot input
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int userSlot = getUserSlot();

        System.out.println("You selected slot: " + userSlot);
    }
}