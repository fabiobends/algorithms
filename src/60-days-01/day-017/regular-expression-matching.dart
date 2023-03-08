class Solution {
  bool isMatch(String s, String p) {
    final regex = RegExp("^$p\$");
    return regex.firstMatch(s) != null;
  }
}