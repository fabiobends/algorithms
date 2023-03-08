class Solution {
  bool isValid(List<List<String>> board, int row, int col, int digit) {
    String ch = digit.toString();
    for (int i = 0; i < 9; i++) {
      if (board[i][col] == ch) {
        return false;
      }
      if (board[row][i] == ch) {
        return false;
      }
      if (board[3 * (row / 3).floor() + (i / 3).floor()]
              [3 * (col / 3).floor() + i % 3] ==
          ch) {
        return false;
      }
    }
    return true;
  }

  bool solve(List<List<String>> board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          for (int digit = 1; digit <= 9; digit++) {
            if (isValid(board, i, j, digit)) {
              board[i][j] = digit.toString();
              if (solve(board)) {
                return true;
              }
              board[i][j] = '.';
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  void solveSudoku(List<List<String>> board) {
    solve(board);
  }
}
