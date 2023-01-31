class Solution {
  bool isValid(String s) {
    final stack = List.empty(growable: true);
    for (int i = 0; i < s.length; i++){
      if (s[i] == '(' || s[i] == '[' || s[i] == '{'){
        stack.add(s[i]);
        continue;
      }
      if (stack.length == 0){
        return false;
      }
      final matcher = stack.removeLast();
      switch(s[i]){
        case '}': {
          if (matcher == '(' || matcher == '[') return false;
          break;
        }
        case ']': {
          if (matcher == '(' || matcher == '{') return false;
          break;
        }
        case ')': {
          if (matcher == '{' || matcher == '[') return false;
          break;
        }
      }
    }
    return stack.length == 0;
  }
}