import 'dart:math';

class Solution {
  int longestValidParentheses(String s) {
    int maxLength = 0;
    final List<int> stack = [];
    stack.add(-1);
    for (int i = 0; i < s.length; i++) {
      if (s[i] == '(') {
        stack.add(i);
      } else {
        stack.removeLast();
        if (stack.isEmpty) {
          stack.add(i);
        } else {
          maxLength = max(maxLength, i - stack.last);
        }
      }
    }
    return maxLength;
  }
}
