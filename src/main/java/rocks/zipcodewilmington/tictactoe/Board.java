package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [] [] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return true;
            }
            if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                return true;
            }

        }
        if (board[0][0])
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
