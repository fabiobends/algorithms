class Solution {
  String convert(String s, int numRows) {
    final rowStrings = List<String>.filled(numRows, "");
    for (int i = 0; i < s.length; i++){
      final row = getRowNumber(i, numRows);
      rowStrings[row] += + s[i];
    }
    return rowStrings.join("");
  }

  int getRowNumber(int index, int numRows){
    if (numRows == 1) return 0;
    final vShapeLength = numRows * 2 - 2;
    final rowCandidate = index % vShapeLength;
    if (rowCandidate >= numRows){
      return vShapeLength - rowCandidate;
    }
    return rowCandidate;
  }
}