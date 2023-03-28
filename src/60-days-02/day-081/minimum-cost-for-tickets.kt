class Solution {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
      val dp = IntArray(366){ 0 }
      for (i in 1 until 366){
        if (!days.contains(i)){
          dp[i] = dp[i-1]
        } else {
          dp[i] = minOf(
            dp[i-1] + costs[0], 
            dp[maxOf(0, i-7)] + costs[1], 
            dp[maxOf(0, i-30)] + costs[2]
          )
        }
      }
      return dp[365]
    }
}