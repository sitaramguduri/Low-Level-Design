package tictactoe;
import com.sun.tools.javac.util.Pair;


import players.PlayerPiece;

import java.util.ArrayList;
import java.util.List;

public class Board {

    PlayerPiece[][] board;
    public  Board(PlayerPiece[][] board){

        this.board = board;
    }
    public void putPiece(int X, int Y, PlayerPiece piece){

        board[X][Y] = piece;
    }
    public List<Pair<Integer, Integer>> getFreeCells(){
        List<Pair<Integer, Integer>> freeCellsList = new ArrayList<>();
        for (int i = 0; i <  board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(board[i][j] == null){
                    Pair<Integer, Integer> newPair = new Pair<>(i, j);
                    freeCellsList.add(newPair);
                }
            }
        }
        return freeCellsList;
    }

    public void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j ++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println("");
        }
    }


}
