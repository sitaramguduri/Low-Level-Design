package tictactoe;

import players.PlayerPiece;
import players.PieceType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Board {
    private final int size;
    private final PlayerPiece[][] grid;

    public Board(int size) {
        this.size = size;
        this.grid = new PlayerPiece[size][size];
        // Initially, grid[i][j] == null means empty.
    }

    /**
     * Attempt to place `piece` at (row, col).
     * Returns true if successful, false if out of bounds or already occupied.
     */
    public boolean placePiece(int row, int col, PlayerPiece piece) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false; // out of bounds
        }
        if (grid[row][col] != null) {
            return false; // already occupied
        }
        grid[row][col] = piece;
        return true;
    }

    /**
     * Check all rows, columns, and two diagonals for a “size-in-a-row” match.
     * If found, return the winning PieceType (X or O). Otherwise, return Optional.empty().
     */
    public Optional<PieceType> checkWinner() {
        // Check each row
        for (int i = 0; i < size; i++) {
            PlayerPiece first = grid[i][0];
            if (first != null) {
                boolean allSame = true;
                for (int j = 1; j < size; j++) {
                    if (grid[i][j] == null || grid[i][j].getType() != first.getType()) {
                        allSame = false;
                        break;
                    }
                }
                if (allSame) {
                    return Optional.of(first.getType());
                }
            }
        }
        // Check each column
        for (int j = 0; j < size; j++) {
            PlayerPiece first = grid[0][j];
            if (first != null) {
                boolean allSame = true;
                for (int i = 1; i < size; i++) {
                    if (grid[i][j] == null || grid[i][j].getType() != first.getType()) {
                        allSame = false;
                        break;
                    }
                }
                if (allSame) {
                    return Optional.of(first.getType());
                }
            }
        }
        // Check main diagonal
        PlayerPiece firstDiag = grid[0][0];
        if (firstDiag != null) {
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (grid[i][i] == null || grid[i][i].getType() != firstDiag.getType()) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                return Optional.of(firstDiag.getType());
            }
        }
        // Check anti-diagonal
        PlayerPiece firstAnti = grid[0][size - 1];
        if (firstAnti != null) {
            boolean allSame = true;
            for (int i = 1; i < size; i++) {
                if (grid[i][size - 1 - i] == null
                        || grid[i][size - 1 - i].getType() != firstAnti.getType()) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                return Optional.of(firstAnti.getType());
            }
        }
        return Optional.empty();
    }

    /** Return true if every cell is non-null (i.e. board is full). */
    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /** Return the current board as a formatted string (for printing). */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(grid[i][j] == null ? "." : grid[i][j].toString());
                if (j < size - 1) sb.append(" | ");
            }
            sb.append("\n");
            if (i < size - 1) {
                sb.append("-".repeat(size * 4 - 3)).append("\n");
            }
        }
        return sb.toString();
    }

    /** Allow the UI or tests to know the board’s dimensions. */
    public int getSize() {
        return size;
    }
}
