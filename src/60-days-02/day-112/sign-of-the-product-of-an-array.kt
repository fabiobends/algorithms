class Solution {
  fun arraySign(nums: IntArray): Int {
    var negative = 0
    for (n in nums) {
      if (n < 0) {
        negative++
      } else if (n == 0) {
        return 0
      }
    }
    return if (negative % 2 == 0) 1 else -1
  }
}