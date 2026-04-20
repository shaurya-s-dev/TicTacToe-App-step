public class UC2_TicTacToe {

    static char humanSymbol;
    static char compSymbol;
    static String currentPlayer;

    public static void main(String[] args) {

        System.out.println("=== UC2: Toss to Decide First Player ===");
        System.out.println();
        performToss();

        System.out.println("Current Player : " + currentPlayer);
        System.out.println("Human  Symbol  : " + humanSymbol);
        System.out.println("Computer Symbol: " + compSymbol);
    }

    // Randomly decide who plays first and assign X / O
    static void performToss() {
        int toss = (int) (Math.random() * 2);   // generates 0 or 1

        if (toss == 0) {
            humanSymbol   = 'X';
            compSymbol    = 'O';
            currentPlayer = "human";
            System.out.println("Toss Result : YOU win the toss!");
            System.out.println("You play X  and go FIRST.");
        } else {
            humanSymbol   = 'O';
            compSymbol    = 'X';
            currentPlayer = "computer";
            System.out.println("Toss Result : COMPUTER wins the toss!");
            System.out.println("Computer plays X and goes FIRST.");
        }
        System.out.println();
    }
}
