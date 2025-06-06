package players;

import display.Cell;
import display.ConsoleUI;
import tictactoe.Board;


public class HumanPlayer implements IPlayer {
    private final String name;
    private final PlayerPiece piece;
    private final ConsoleUI ui = new ConsoleUI(); // each human player has a UI

    public HumanPlayer(String name, PieceType type) {
        this.name = name;
        this.piece = new PlayerPiece(type);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PlayerPiece getPiece() {
        return piece;
    }

    @Override
    public Cell chooseMove(Board board) {
        // Let the UI ask “Alice (X), enter row/col”
        return ui.promptMove(this, board);
    }
}
