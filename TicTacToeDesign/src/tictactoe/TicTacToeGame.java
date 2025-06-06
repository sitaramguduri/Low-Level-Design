package tictactoe;

import display.Cell;
import display.ConsoleUI;
import players.IPlayer;
import players.PieceType;

import java.util.List;
import java.util.Optional;

public class TicTacToeGame {
    private final Board board;
    private final List<IPlayer> players;
    private final ConsoleUI ui;

    // Constructor injection of dependencies
    public TicTacToeGame(Board board, List<IPlayer> players, ConsoleUI ui) {
        this.board = board;
        this.players = players;
        this.ui = ui;
    }

    public void startGame() {
        int currentPlayerIndex = 0;
        ui.displayBoard(board); // show initial empty board

        while (true) {
            IPlayer current = players.get(currentPlayerIndex);
            Cell move = current.chooseMove(board);

            // Attempt to place the piece
            boolean success = board.placePiece(move.row, move.col, current.getPiece());
            if (!success) {
                ui.showMessage("Invalid move. That cell is either out of bounds or already occupied. Try again.");
                continue; // same player retries
            }

            // Show updated board
            ui.displayBoard(board);

            // Check for winner
            Optional<PieceType> maybeWinner = board.checkWinner();
            if (maybeWinner.isPresent()) {
                ui.showMessage("Game over! " + current.getName() + " (" + current.getPiece() + ") wins!");
                break;
            }

            // Check for draw
            if (board.isFull()) {
                ui.showMessage("Game over! It’s a draw.");
                break;
            }

            // Switch to next player
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }
}
