class Solution {
  fun longestPalindromeSubseq(s: String): Int {
    val n = s.length
    var dp = IntArray(n)
    for (i in n-1 downTo 0) {
      val localdp = IntArray(n)
      localdp[i] = 1;
      for (j in i+1 until n) {
        if (s[i] == s[j]) {
          localdp[j] = 2 + dp[j-1];
        } else {
          localdp[j] = maxOf(dp[j], localdp[j-1]);
        }
      }
      dp = localdp
    }
    return dp[n-1];
  }
}