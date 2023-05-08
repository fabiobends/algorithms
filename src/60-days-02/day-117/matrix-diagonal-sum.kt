class Solution {
  fun diagonalSum(mat: Array<IntArray>): Int {
    val n = mat.size
    var sum = 0
    for (i in 0 until n){
      sum += mat[i][i]
      sum += mat[n - i - 1][i]
    }
    if (n % 2 == 1) return sum - mat[n / 2][n / 2]
    return sum
  }
}