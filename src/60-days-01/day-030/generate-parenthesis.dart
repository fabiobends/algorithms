class Solution {
  List<String> generateParenthesis(int n) {
    final result = List<String>.empty(growable: true);
    if (n == 0) {
      result.add("");
    } else {
      for (int c = 0; c < n; c++) {
        for (String left in generateParenthesis(c)) {
          for (String right in generateParenthesis(n-1-c)) {
            result.add("(" + left + ")" + right);
          }
        }
      }
    }
    return result;
  }
}