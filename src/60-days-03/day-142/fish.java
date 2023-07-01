import java.util.Stack;

class Solution {
  public int solution(int[] A, int[] B) {
    Stack<Integer> fish = new Stack<Integer>();
    int numAlive = A.length;

    for (int i = 0; i < A.length; i++) {
      if (B[i] == 1) {
        fish.add(A[i]);
        continue;
      }
      while (!fish.isEmpty()) {
        if (fish.peek() > A[i]) {
          numAlive--;
          break;
        }
        if (fish.peek() < A[i]) {
          numAlive--;
          fish.pop();
        }
      }
    }

    return numAlive;
  }
}