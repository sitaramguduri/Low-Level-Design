package game;

public class Player {
    String player;
    Piece piece;
    public  Player(String player, Piece piece){
        this.player = player;
        this.piece = piece;
    }
    public Piece getPiece(){
        return piece;
    }


}
