import java.util.Random;
import java.util.Scanner;

public class TicTacToe_UC8 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

   
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    
    public static void playerMove(char[][] board, char symbol) {
        int slot, row, col;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            slot = scanner.nextInt();

            int[] pos = convertSlotToIndex(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, symbol);
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    
    public static void computerMove(char[][] board, char symbol) {
        int slot, row, col;

        while (true) {
            slot = random.nextInt(9) + 1;

            int[] pos = convertSlotToIndex(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, symbol);
                System.out.println("Computer chose: " + slot);
                break;
            }
        }
    }

    
    public static boolean checkWin(char[][] b, char s) {


        for (int i = 0; i < 3; i++) {
            if ((b[i][0] == s && b[i][1] == s && b[i][2] == s) ||
                (b[0][i] == s && b[1][i] == s && b[2][i] == s)) {
                return true;
            }
        }

       
        return (b[0][0] == s && b[1][1] == s && b[2][2] == s) ||
               (b[0][2] == s && b[1][1] == s && b[2][0] == s);
    }


    public static boolean isDraw(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '-') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char player = 'X';
        char computer = 'O';

        boolean gameOver = false;

        printBoard(board);

        while (!gameOver) {

           
            playerMove(board, player);
            printBoard(board);

            if (checkWin(board, player)) {
                System.out.println("Player wins!");
                break;
            }

            if (isDraw(board)) {
                System.out.println("It's a draw!");
                break;
            }

           
            computerMove(board, computer);
            printBoard(board);

            if (checkWin(board, computer)) {
                System.out.println("Computer wins!");
                break;
            }

            if (isDraw(board)) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }
}