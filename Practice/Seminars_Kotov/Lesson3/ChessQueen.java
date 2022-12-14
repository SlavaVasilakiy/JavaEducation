import java.util.ArrayList;
import java.util.List;

public class ChessQueen {
    public static void main(String[] args) {
        FerthStart start = new FerthStart();
        List result = start.solveNQueens(4);
//        start.printBoard(result);
    }
}

class FerthStart {
    int[][] board;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        backtrack(0);
        return ans;
    }

    private void backtrack(int col) {
        if (col == board.length) {
            addBoard();
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (canPlace(row, col)) {
                board[row][col] = col;
                backtrack(col + 1);
                board[row][col] = 0;
            }
        }
    }

    private boolean canPlace(int i, int j) {
        // left
        for (int col = j - 1; col >= 0; col--) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // top and left
        for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) {
                return false;
            }
        }
        // down and left
        for (int row = i + 1, col = j - 1; row < board.length && col >= 0; row++, col--) {
            if (board[row][col] == 1) {
                return false;
            }
        }
        return true;
    }
    public void printBoard(List<List<String >> boards) {
        for (int i = 0; i < boards.size(); i++) {
            for (int j = 0; j < boards.get(i).size(); j++) {
                System.out.print(boards.get(i).get(j));
            }
            System.out.println();
        }
    }

    private void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[j][i] == 0 ? '.' : 'Q');
                // if board[j][i] == 0 --> sb.append('.')
                // else --> sb.append('Q')
            }
            b.add(sb.toString());
        }
        System.out.println(b);
        ans.add(b);
    }
}