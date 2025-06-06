import display.ConsoleUI;
import players.HumanPlayer;
import players.IPlayer;
import players.PieceType;
import tictactoe.Board;
import tictactoe.TicTacToeGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(3);

        // 2) Create two human players (Alice uses X, Bob uses O)
        IPlayer alice = new HumanPlayer("Alice", PieceType.X);
        IPlayer bob   = new HumanPlayer("Bob",   PieceType.O);

        // 3) Create the ConsoleUI
        ConsoleUI ui = new ConsoleUI();

        // 4) Create and start the game
        TicTacToeGame game = new TicTacToeGame(board, Arrays.asList(alice, bob), ui);
        game.startGame();


    }
}