package players;

import display.Cell;
import tictactoe.Board;

public interface IPlayer {
    String getName();
    PlayerPiece getPiece();

    /**
     * Decide on a move (row, col) given the current board.
     * A HumanPlayer implementation will prompt via ConsoleUI.
     * An AIPlayer implementation would run some algorithm.
     */
    Cell chooseMove(Board board);
}
