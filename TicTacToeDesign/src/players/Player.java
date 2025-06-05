package players;

public class Player {
    String name;

    public String getName() {
        return name;
    }

    public Player(String name, PlayerPiece piece){
        this.name = name;
        this.piece = piece;

    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerPiece getPiece() {
        return piece;
    }

    public void setPiece(PlayerPiece piece) {
        this.piece = piece;
    }

    PlayerPiece piece;





}
