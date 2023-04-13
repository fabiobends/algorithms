class Solution {
  fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val stack = Stack<Int>()
    var i = 0
    
    for(value in pushed){
      stack.push(value)
      while(!stack.isEmpty() && stack.peek() == popped[i]){
        stack.pop()
        i++
      }
    }
    return stack.isEmpty();
  }
}