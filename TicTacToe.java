import java.util.Scanner;

public class UC3_TicTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== UC3: Accept User Slot Input ===");
        System.out.println();

        int slot = getUserSlot();

        System.out.println("You entered slot: " + slot);
    }

    // Read slot number (1–9) from the human player
    static int getUserSlot() {
        System.out.print("Enter your slot (1-9): ");
        return sc.nextInt();
    }
}
