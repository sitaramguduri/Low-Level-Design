package players;

public class PlayerPiece {
    private final PieceType type;

    public PlayerPiece(PieceType type) {
        this.type = type;
    }

    public PieceType getType() {
        return type;
    }

    /**
     * Returns the single‐character symbol for this piece.
     * e.g. "X" or "O".
     */
    @Override
    public String toString() {
        return type.name();
    }
}
