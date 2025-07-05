package game;

public class Board {
    // we need to have a board here which has nXn dimensions so that we can extend it and
    // we need to be able to put pieces on the board and when after we put a piece if the board has a diagonal or straight line with
    // same pieces. The board should be able to tell that the game has a winner if not and there is no space left the board should be able to tell that
    // the game is over.
    public Piece[][] board;
    int size;
    public Board(int n){
        board  = new Piece[n][n];
        size = n;
    }

    // we need two functions one function is put the piece on the board
    // check for winner or draw
    public boolean putPiece(Piece piece, int row ,int col){
        boolean isWin = false;
        if(board[row][col] == null){
            board[row][col] =piece;
            isWin = isWinner(piece);
//            if(isWin){
//                // will call a method that displays the winner
//            }
        }else{
            // error saying that there already exists a piece

        }
        return isWin;
    }
    // 0,0 0,1 0,2
    // 1,0 1,1 1,2
    // 2,0 2,1 2,2
    public boolean isWinner(Piece piece){
        boolean isWin = true;
        for(int i =0 ; i<size; i++){
            for(int j = 0; j < size ; j++){
                if(board[i][j] != piece){
                    isWin = false;
                    break;
                }
                if(board[j][i] != piece){
                    isWin = false;
                    break;
                }
            }
        }
        // have to check for diagonalsQ!!!

        return isWin;
    }

}
