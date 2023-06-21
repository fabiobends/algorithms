import java.util.Stack;

class Solution {
  public int solution(String S) {
    final Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '{' || S.charAt(i) == '[' || S.charAt(i) == '(') {
        stack.push(S.charAt(i));
        continue;
      }

      if (stack.size() == 0)
        return 0;

      char option = (char) stack.pop();
      switch (option) {
        case '{': {
          if (S.charAt(i) == ']' || S.charAt(i) == ')')
            return 0;
          break;
        }
        case '[': {
          if (S.charAt(i) == '}' || S.charAt(i) == ')')
            return 0;
          break;
        }
        case '(': {
          if (S.charAt(i) == ']' || S.charAt(i) == '}')
            return 0;
          break;
        }
      }
    }
    return stack.size() == 0 ? 1 : 0;
  }
}