# UC4 — Convert Slot Number (1–9) to Board Index (Row, Column)

**Branch:** `feature/convertslot`

---

## Goal
Convert the user-entered slot number (1–9) into valid row and column indices for the 2D board array.

## Actor
Human Player

## Flow
```
Slot entered → system converts slot → row & column generated → symbol placed
```

---

## Key Concepts

| Concept | How it is used |
|---------|---------------|
| Zero-based Indexing | Subtract 1 from slot to shift from 1-based to 0-based |
| Mathematical Mapping | Every slot maps to exactly one `[row][col]` |
| Division | `(slot - 1) / 3` gives the row |
| Modulo | `(slot - 1) % 3` gives the column |
| Utility Methods | `getRow()`, `getCol()`, `convertAndPlace()` are separate methods |

---

## Slot → Index Mapping

```
Slot:          Board Index:
1 | 2 | 3      [0][0] | [0][1] | [0][2]
4 | 5 | 6      [1][0] | [1][1] | [1][2]
7 | 8 | 9      [2][0] | [2][1] | [2][2]
```

| Slot | slot−1 | row = (slot−1)/3 | col = (slot−1)%3 |
|------|--------|------------------|------------------|
| 1 | 0 | 0 | 0 |
| 2 | 1 | 0 | 1 |
| 3 | 2 | 0 | 2 |
| 4 | 3 | 1 | 0 |
| 5 | 4 | 1 | 1 |
| 6 | 5 | 1 | 2 |
| 7 | 6 | 2 | 0 |
| 8 | 7 | 2 | 1 |
| 9 | 8 | 2 | 2 |

---

## Output (example)

```
Slot 1  -->  board[0][0]
Slot 2  -->  board[0][1]
Slot 3  -->  board[0][2]
Slot 4  -->  board[1][0]
Slot 5  -->  board[1][1]
...

Placed X at slot 5

  Slot guide :   Board :
  1 | 2 | 3       - | - | -
  ---------       ---------
  4 | 5 | 6       - | X | -
  ---------       ---------
  7 | 8 | 9       - | - | -
```

---

## How to Run

```bash
javac UC4_TicTacToe.java
java UC4_TicTacToe
```

---

## Key Code

```java
// Row using integer division
static int getRow(int slot) {
    return (slot - 1) / 3;
}

// Column using modulo
static int getCol(int slot) {
    return (slot - 1) % 3;
}

// Place symbol after conversion
static void convertAndPlace(int slot, char symbol) {
    int row = getRow(slot);
    int col = getCol(slot);
    board[row][col] = symbol;
}
```
