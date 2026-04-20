# TicTacToe-App-step

A console-based Tic-Tac-Toe game where a **Human** plays against the **Computer**.  
Built step-by-step using use cases to practice Java fundamentals.

---

## Project Structure

```
TicTacToe-App-step/
│
├── UC1_TicTacToe.java       → Display empty board
├── UC2_TicTacToe.java       → Toss to decide first player
├── UC3_TicTacToe.java       → Accept user slot input
├── UC4_TicTacToe.java       → Convert slot to board index
└── TicTacToe.java           → Full combined game
```

---

## Branch Structure

| Branch | Use Case | Description |
|--------|----------|-------------|
| `main` | — | Full project, all use cases combined |
| `feature/UC1-display-empty` | UC1 | Initialise and display empty 3×3 board |
| `feature/UC2-TOSS-TO-DECIDE` | UC2 | Random toss, assign X/O, set first player |
| `feature/accept-user` | UC3 | Read slot number (1–9) from human player |
| `feature/convertslot` | UC4 | Convert slot to `[row][col]` using division & modulo |

---

## Use Cases

### UC1 — Display Empty Board
- Create a `char[3][3]` array
- Initialise all cells with `'-'`
- Print the board in a readable format

**Concepts:** 2D Array · Initialization Logic · Nested Loops · Console Output

---

### UC2 — Toss to Decide First Player
- Use `Math.random()` to generate 0 or 1
- Assign `X` to winner, `O` to the other
- Store `currentPlayer`, `humanSymbol`, `compSymbol`

**Concepts:** Random Number Generation · Conditional Logic · Game State Variables

---

### UC3 — Accept User Slot Input
- Prompt human to enter a slot number (1–9)
- Read input using `Scanner.nextInt()`
- Return value to game logic

**Concepts:** User Input Handling · Method Creation · Separation of Concerns

---

### UC4 — Convert Slot to Board Index
- Convert 1-based slot to 0-based `[row][col]`
- `row = (slot - 1) / 3`
- `col = (slot - 1) % 3`

**Concepts:** Zero-based Indexing · Division & Modulo · Mathematical Mapping · Utility Methods

---

## How to Run

```bash
# Compile
javac TicTacToe.java

# Run
java TicTacToe
```

To run a specific UC file:
```bash
javac UC1_TicTacToe.java
java UC1_TicTacToe
```

---

## Slot to Board Index Mapping

```
Slot:          Board Index:
1 | 2 | 3      [0][0] | [0][1] | [0][2]
4 | 5 | 6      [1][0] | [1][1] | [1][2]
7 | 8 | 9      [2][0] | [2][1] | [2][2]
```

---

## Tech Stack

- Language : Java
- Input    : Console (Scanner)
- IDE      : Any (VS Code / IntelliJ / Eclipse)

---

## Author

**Diptanshu Sinha**  
Console Tic-Tac-Toe — Step-by-step use case implementation
