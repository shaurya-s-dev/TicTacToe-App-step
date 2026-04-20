# UC1 — Display Empty Tic-Tac-Toe Board

**Branch:** `feature/UC1-display-empty`

---

## Goal
Display an empty 3×3 Tic-Tac-Toe board on the console so the user can see the game layout before starting.

## Actor
User — the person who runs the program.

## Flow
```
User runs program → program initialises board → program prints empty board
```

---

## Key Concepts

| Concept | How it is used |
|---------|---------------|
| 2D Array | `char board[3][3]` stores all 9 cells |
| Initialization Logic | Every cell set to `'-'` before display |
| Nested Loops | Outer = rows, Inner = columns |
| Console Output | `System.out.print` formats the grid |

---

## Output

```
- | - | -
---------
- | - | -
---------
- | - | -
```

---

## How to Run

```bash
javac UC1_TicTacToe.java
java UC1_TicTacToe
```

---

## Key Code

```java
// Initialise
for (int row = 0; row < 3; row++)
    for (int col = 0; col < 3; col++)
        board[row][col] = '-';

// Display
for (int row = 0; row < 3; row++) {
    for (int col = 0; col < 3; col++) {
        System.out.print(board[row][col]);
        if (col < 2) System.out.print(" | ");
    }
    System.out.println();
    if (row < 2) System.out.println("---------");
}
```
