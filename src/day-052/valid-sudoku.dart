class Solution {
  bool isValidSudoku(List<List<String>> board) {
    Map<String, bool> verifierRow = {};
    Map<String, bool> verifierColumn = {};
    final int length = board.length;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        final String valueRow = board[i][j];
        final String valueColumn = board[j][i];
        if (valueRow != '.') {
          if (verifierRow.containsKey(valueRow)) {
            return false;
          } else {
            verifierRow[valueRow] = true;
          }
        }
        if (valueColumn != '.') {
          if (verifierColumn.containsKey(valueColumn)) {
            return false;
          } else {
            verifierColumn[valueColumn] = true;
          }
        }
      }
      verifierRow = {};
      verifierColumn = {};
    }
    Map<String, bool> verifierMatrix = {};
    for (int stepRow = 0; stepRow < length; stepRow += 3) {
      for (int stepColumn = 0; stepColumn < length; stepColumn += 3) {
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            final String value = board[i + stepRow][j + stepColumn];
            if (value != '.') {
              if (verifierMatrix.containsKey(value)) {
                return false;
              }
              verifierMatrix[value] = true;
            }
          }
        }
        verifierMatrix = {};
      }
    }
    return true;
  }
}
