package tictactoe;

import players.*;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeGame {

    // initialise the board;

    public void intializeGame(){
        PlayerPiece[][] pieces = new PlayerPiece[3][3];
        Board gameBoard = new Board(pieces);

        gameBoard.printBoard();
        List<Player> playersList = new ArrayList<>();
        playersList.add(new Player("user 1", new PieceX(PieceType.X)));
        playersList.add(new Player("user 2",new PieceO(PieceType.O)));
    }
    public void startGame(){
        boolean noWinner = false;
        System.out.print("Game is being played");

    }



}
