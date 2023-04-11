class Solution {
  fun removeStars(s: String): String {
    val stack = Stack<Char>()
    for (char in s) {
      if (char == '*') stack.pop()
      else stack.push(char)
    }
    return stack.joinToString("")
  }
}