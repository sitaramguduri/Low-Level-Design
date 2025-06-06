package display;

import players.IPlayer;
import tictactoe.Board;

import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner  = new Scanner(System.in);

    public void displayBoard(Board board){
        System.out.println(board.toString());
    }
    public Cell promptMove(IPlayer player, Board board) {
        System.out.printf("%s (%s), enter your move (row [0-%d] and column [0-%d]):%n",
                player.getName(),
                player.getPiece(),       // e.g. “X” or “O”
                board.getSize() - 1,
                board.getSize() - 1);

        // Loop until we get two integers from the user
        int row = -1, col = -1;
        while (true) {
            try {
                row = Integer.parseInt(scanner.next());
                col = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Enter two integers separated by space.");
            }
        }
        return new Cell(row, col);
    }
    public void showMessage(String message) {
        System.out.println(message);
    }


}
