# UC2 — Toss to Decide First Player and Symbol

**Branch:** `feature/UC2-TOSS-TO-DECIDE`

---

## Goal
Randomly decide which player starts the game and assign symbols (X or O) to each player before the game begins.

## Actor
Game System — the system automatically performs the toss and assigns roles.

## Flow
```
Game starts → system performs toss → assigns symbols → decides first turn
```

---

## Key Concepts

| Concept | How it is used |
|---------|---------------|
| Random Number Generation | `Math.random() * 2` produces 0 or 1 |
| Conditional Logic | `if/else` assigns X/O based on toss result |
| Game State Variables | `currentPlayer`, `humanSymbol`, `compSymbol` stored for later use |

---

## Logic

```
toss = 0  →  Human gets X,   Computer gets O,  Human goes first
toss = 1  →  Computer gets X, Human gets O,    Computer goes first
```

---

## Output (example)

```
Toss Result : YOU win the toss!
You play X  and go FIRST.

Current Player : human
Human  Symbol  : X
Computer Symbol: O
```

---

## How to Run

```bash
javac UC2_TicTacToe.java
java UC2_TicTacToe
```

---

## Key Code

```java
int toss = (int) (Math.random() * 2);   // 0 or 1

if (toss == 0) {
    humanSymbol   = 'X';
    compSymbol    = 'O';
    currentPlayer = "human";
} else {
    humanSymbol   = 'O';
    compSymbol    = 'X';
    currentPlayer = "computer";
}
```
