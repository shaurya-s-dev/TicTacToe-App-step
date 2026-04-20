# UC3 — Accept User Slot Input (1–9)

**Branch:** `feature/accept-user`

---

## Goal
Allow the human player to enter a slot number between 1 and 9, which the program reads and passes back to the game logic.

## Actor
Human Player

## Flow
```
User enters slot number → program reads input → control returns to game logic
```

---

## Key Concepts

| Concept | How it is used |
|---------|---------------|
| User Input Handling | `Scanner.nextInt()` reads the integer from console |
| Method Creation | `getUserSlot()` wraps input logic in its own method |
| Separation of Concerns | Input reading is isolated from validation and game logic |

---

## Output (example)

```
Enter your slot (1-9): 5
You entered slot: 5
```

---

## How to Run

```bash
javac UC3_TicTacToe.java
java UC3_TicTacToe
```

---

## Key Code

```java
static int getUserSlot() {
    System.out.print("Enter your slot (1-9): ");
    return sc.nextInt();
}
```

> Note: Validation (checking the slot is not already taken) is handled in UC4.
