public class UC4_TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        System.out.println("=== UC4: Convert Slot to Board Index ===");
        System.out.println();

        initBoard();

        // Demo: show mapping for all 9 slots
        System.out.println("Slot --> [row][col] mapping:");
        System.out.println("----------------------------");
        for (int slot = 1; slot <= 9; slot++) {
            int row = getRow(slot);
            int col = getCol(slot);
            System.out.println("Slot " + slot + "  -->  board[" + row + "][" + col + "]");
        }

        System.out.println();

        // Demo: place X at slot 5
        int testSlot = 5;
        convertAndPlace(testSlot, 'X');
        System.out.println("Placed X at slot " + testSlot);
        System.out.println();
        displayBoard();
    }

    // ─── UC4 Core Methods ────────────────────────────────────────────────

    // Convert slot (1–9) to row index using integer division
    // Formula: row = (slot - 1) / 3
    //
    //  Slot 1,2,3  → (slot-1) = 0,1,2  → /3 = 0  → row 0
    //  Slot 4,5,6  → (slot-1) = 3,4,5  → /3 = 1  → row 1
    //  Slot 7,8,9  → (slot-1) = 6,7,8  → /3 = 2  → row 2
    static int getRow(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot (1–9) to column index using modulo
    // Formula: col = (slot - 1) % 3
    //
    //  Slot 1,4,7  → (slot-1) = 0,3,6  → %3 = 0  → col 0
    //  Slot 2,5,8  → (slot-1) = 1,4,7  → %3 = 1  → col 1
    //  Slot 3,6,9  → (slot-1) = 2,5,8  → %3 = 2  → col 2
    static int getCol(int slot) {
        return (slot - 1) % 3;
    }

    // Utility method: convert slot and place symbol on board
    static void convertAndPlace(int slot, char symbol) {
        int row = getRow(slot);
        int col = getCol(slot);
        board[row][col] = symbol;
    }

    // ─── Supporting Methods (from UC1) ───────────────────────────────────

    static void initBoard() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = '-';
    }

    static void displayBoard() {
        System.out.println("  Slot guide :   Board :");
        for (int row = 0; row < 3; row++) {
            int base = row * 3;
            System.out.printf("  %d | %d | %d       %c | %c | %c%n",
                base + 1, base + 2, base + 3,
                board[row][0], board[row][1], board[row][2]);
            if (row < 2)
                System.out.println("  ---------       ---------");
        }
        System.out.println();
    }
}
