import java.util.HashSet;
import java.util.Set;

public class SudokuSolution {

  public static void main(String[] args) {

    char[][] arr = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    System.out.print(isValidSudoku(arr));
  }

  public static boolean isValidSudoku(char[][] board) {
    Set<Character> rowSet = null;
    Set<Character> colSet = null;
    for (int i = 0; i < 9; i++) {
      rowSet = new HashSet<>();
      colSet = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        char r = board[i][j];
        char c = board[j][i];
        if (r != '.') {
          if (rowSet.contains(r)) {
            return false;
          } else {
            rowSet.add(r);
          }
        }
        if (c != '.') {
          if (colSet.contains(c)) {
            return false;
          } else {
            colSet.add(c);
          }
        }
      }
    }
    for (int i = 0; i < 9; i += 3) {
      for (int j = 0; j <9; j += 3) {
        if (!checkBlock(i, j, board)) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean checkBlock(int i, int j, char[][] board) {
    Set<Character> blockSet = new HashSet<>();
    int rows = i + 3;
    int cols = j + 3;

    for (int k = i; k < rows; k++) {
      for (int l = j; l < cols; l++) {
        if (board[k][l] == '.') {
          continue;
        }
        if (blockSet.contains(board[k][l])) {
          return false;
        }
        blockSet.add(board[k][l]);
      }
    }
    return true;
  }


}
