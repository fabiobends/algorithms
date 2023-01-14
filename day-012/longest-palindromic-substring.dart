import 'dart:math' as math;

class Solution {
  String longestPalindrome(String s) {
    if (s.length < 1) return "";
    int start = 0;
    int end = 0;
    for (int i = 0; i < s.length; i++) {
      int len1 = expandAroundCenter(s, i, i);
      int len2 = expandAroundCenter(s, i, i + 1);
      int len = math.max(len1, len2);
      if (len > end - start) {
        start = i - ((len - 1) / 2).floor();
        end = i + (len / 2).floor();
      }
    }
    return s.substring(start, end + 1);
  }

  int expandAroundCenter(String s, int left, int right) {
    int l = left;
    int r = right;
    while (l >= 0 && r < s.length && s[l] == s[r]) {
      l--;
      r++;
    }
    return r - l - 1;
  }
}