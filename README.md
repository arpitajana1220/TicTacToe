# Tic Tac Toe Game

This is a simple Tic Tac Toe game implemented in Java. The game supports both human and bot players, and includes various winning strategies.

## Features

- Supports human vs human, human vs bot, and bot vs bot gameplay.
- Multiple winning strategies including row, column, and diagonal checks.
- Undo functionality to revert the last move.
- Easy bot difficulty level.

## Project Structure

- `src/tictactoe/models`: Contains the core models such as `Board`, `Cell`, `Player`, `Bot`, etc.
- `src/tictactoe/controller`: Contains the `GameController` class which handles the game logic.
- `src/tictactoe/winningstrategies`: Contains the different winning strategies implemented.
- `src/tictactoe/exceptions`: Contains custom exceptions used in the project.
- `src/tictactoe/AppRunner`: Contains the `App` class which is the entry point of the application.

## UML Diagram

![UML Diagram](uml_diagram.png)

## How to Run

1. Clone the repository:
   ```sh
   git clone https://github.com/arpitajana1220/TicTacToe.git
