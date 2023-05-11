    val n = nums2.size

    var dp = IntArray(n + 1)

    for (i in 1 .. nums1.size) {
      val row = IntArray(n + 1)
      for (j in 1 .. n) {
        row[j] = if (nums1[i - 1] == nums2[j - 1]) {
            dp[j - 1] + 1
        } else {
            maxOf(dp[j], row[j - 1])
        }
      }

      dp = row
    }

    return dp[n]