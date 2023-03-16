class Solution {
  fun climbStairs(n: Int): Int {
    if (n < 2) return n

    var firstStep = 1
    var secondStep = 1
    var thirdStep = 0

    for (i in 2..n) {
      thirdStep = firstStep + secondStep
      firstStep = secondStep
      secondStep = thirdStep
    }

    return thirdStep
  }
}