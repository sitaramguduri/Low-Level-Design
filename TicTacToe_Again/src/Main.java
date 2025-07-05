import game.Board;
import game.PieceX;
import game.PieceY;
import game.Player;

import java.util.LinkedList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        // will have our main function here we initialize the number of players and fix the size of the board
//        initializeGame();
        List<Player> players = new LinkedList<>();
        Board board ;
        Player one = new Player("One", new PieceX());

        Player two = new Player("Two", new PieceY());

        board = new Board(3);
        // one after another so
        boolean noWinner= false;
        while(noWinner){

        }
    }
//    public static void initializeGame(){
//
//        Player one = new Player("One", new PieceX());
//
//        Player two = new Player("Two", new PieceY());
//
//        board = new Board(3);
//    }
}