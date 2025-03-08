# Boba Escape Room

A text-based adventure game where you must solve puzzles in a boba-themed escape room to win your freedom.

## Game Overview

You've been kidnapped and placed in a strange room shaped like a boba cup, with tapioca balls on the walls and sticky brown liquid on the floor. Your goal is to find and drink a boba drink from the vending machine that will teleport you back home.

## How to Play

1. Run the game by executing the `TranProj7Driver` class
2. Follow the on-screen instructions and enter text commands to interact with the environment
3. Solve puzzles by examining objects, finding items, cleaning sticky surfaces, and discovering clues
4. Enter the correct pin in the vending machine to receive your boba drink
5. Drink the boba to escape and win the game!

## Game Objects

### Vending Machine
- Contains boba drinks that will teleport you home
- Has a side door that can be opened to reveal cleaning equipment
- Requires a six-letter pin code to dispense a boba drink

### Sticky Cabinet
- Contains a clue about the vending machine pin
- Needs to be cleaned before it can be unlocked
- Requires a key to unlock

### Blender
- Contains a key that can unlock the cabinet
- Has various buttons that must be pressed in the correct order
- Pressing buttons in the wrong order or pressing the "breakdown" button can lead to game over

### Coupon
- Contains hints about the correct button sequence for the blender
- Can be cleaned to reveal different hints (upside-down text)

## Commands

The game recognizes various commands, including:

- `help`: Displays a list of valid commands
- `look`: Shows all objects in the room
- `examine [object]`: Gives details about a specific object
- `open [object]` or `unlock [object]`: Attempts to open or unlock objects
- `take [object]` or `grab [object]`: Attempts to pick up objects
- `clean [object]` or `wash [object]`: Attempts to clean sticky objects
- `press [button]` or `push [button]`: Presses buttons on the blender
- `enter pin` or `type pin`: Attempts to enter the pin into the vending machine
- `drink boba`: Drinks the boba to escape and win
- `quit`: Exits the game

## Solution Guide

<details>
<summary>Click to reveal solution (SPOILERS)</summary>

1. `look` to see what's in the room
2. `examine blender` to learn about the buttons
3. `examine coupon` to get a hint about the blender buttons
4. Press the blender buttons in order:
   - `press chunky`
   - `press smooth`
   - `press hot`
5. `take key` from the blender
6. `open door` on the vending machine
7. `take equipment` from the vending machine
8. `clean cabinet` with the equipment
9. `unlock cabinet` with the key
10. `examine cabinet` to get the pin hint
11. `enter pin` (answer: Taiwan)
12. `drink boba` to win!

</details>

## Requirements

- Java Runtime Environment (JRE) 8 or higher

## Running the Game

Compile and run the game using:

```bash
javac *.java
java TranProj7Driver
```

## File Structure

- `TranBobaEscapeRoom.java`: Main game class that handles the game logic and player input
- `TranBlender.java`: Class for the blender object
- `TranCoupon.java`: Class for the coupon object
- `TranStickyCabinet.java`: Class for the sticky cabinet object
- `TranVendingMachine.java`: Class for the vending machine object
- `CombinationLock.java`: Utility class for combination locks
- `TranProj7Driver.java`: Driver class to start the game

## Development

This game was developed as a Java programming project demonstrating object-oriented principles through a text-based adventure game format. Each game object is implemented as a separate class with appropriate attributes and methods.

---

Enjoy your escape from the Boba Room! Good luck and have fun!
