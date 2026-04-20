public class UC1_TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();

        System.out.println("=== UC1: Display Empty Board ===");
        System.out.println();
        displayBoard();
    }

    // Initialize all cells with '-'
    static void initBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    // Print the board to console
    static void displayBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) System.out.print(" | ");
            }
            System.out.println();
            if (row < 2) System.out.println("---------");
        }
        System.out.println();
    }
}
