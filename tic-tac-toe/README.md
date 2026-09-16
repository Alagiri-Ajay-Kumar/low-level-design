\# Tic-Tac-Toe – Low-Level Design



A console-based Tic-Tac-Toe game implemented in Java using object-oriented design principles and the Strategy design pattern.



\## Version



Current version: \*\*v1.0\*\*



\## Features



\* Supports a configurable board size

\* Supports two-player gameplay

\* Validates player moves

\* Detects row and column victories

\* Detects a draw when the board is full

\* Allows different rule implementations through the Strategy pattern



\## Design Overview



\* `Board` – Maintains the game board and its state

\* `Player` – Represents a player and their assigned symbol

\* `Symbol` – Defines the available board symbols

\* `Rules` – Defines the contract for game rules

\* `StandardRules` – Implements move validation, winning conditions, and draw detection

\* `Game` – Controls player turns and the overall game flow

\* `TicTacToeApplication` – Creates the required objects and starts the game



\## Design Pattern



\### Strategy Pattern



The `Rules` interface separates game rules from the main game flow. Different rule implementations can be introduced without modifying the `Game` class.



\## Project Structure



```text

tic-tac-toe/

└── src/

&#x20;   └── com/

&#x20;       └── tictactoe/

&#x20;           ├── Board.java

&#x20;           ├── Game.java

&#x20;           ├── Player.java

&#x20;           ├── Rules.java

&#x20;           ├── StandardRules.java

&#x20;           ├── Symbol.java

&#x20;           └── TicTacToeApplication.java

```



\## Planned Enhancements



\* Add diagonal winning rules

\* Add Observer pattern for game-event notifications

\* Add support for additional game modes

\* Improve input validation and exception handling



\## Technologies



\* Java

\* Object-Oriented Programming

\* Low-Level Design

\* Strategy Design Pattern



