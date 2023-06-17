import java.util.Arrays;

class Solution {
  public int solution(int[] A) {
    Arrays.sort(A);
    for (int i = 0; i < A.length - 2; i++) {
      long sum1 = (long) A[i] + (long) A[i + 1];
      long sum2 = (long) A[i] + (long) A[i + 2];
      long sum3 = (long) A[i + 1] + (long) A[i + 2];
      if (sum1 > A[i + 2] && sum2 > A[i + 1] && sum3 > A[i])
        return 1;
    }
    return 0;
  }
}