import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    Arrays.sort(A);
    int result = A[0] * A[1] * A[A.length - 1];
    return Math.max(result, A[A.length - 1] * A[A.length - 2] * A[A.length - 3]);
  }
}