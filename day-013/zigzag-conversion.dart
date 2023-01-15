class Solution {
  String convert(String s, int numRows) {
    Map<int, String?> rowString = Map();
    String newString = "";
    for (int i = 0; i < s.length; i++){
      final row = getRowNumber(i, numRows);
      if(rowString[row] == null){
        rowString[row] = s[i];
      } else {
        rowString[row] = '${rowString[row]}${s[i]}';
      }
    }
    for (int i = 0; i < numRows; i++){
      newString += '${rowString[i]}';
    }
    return newString;
  }

  int getRowNumber(int index, int numRows){
    if (index < numRows){
      return index;
    }
    final vShapeLength = (numRows * 2 - 1);
    final mod = (index + 1) % vShapeLength;
    if (mod > numRows){
      return vShapeLength - mod;
    }
    return mod;
  }
}