public class TicTacToe_UC5 {

   
    public static boolean isValidMove(char[][] board, int row, int col) {

   
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        
        char[][] board = {
                {'-', '-', '-'},
                {'-', 'X', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid move!");
        } else {
            System.out.println("Invalid move!");
        }
    }
}