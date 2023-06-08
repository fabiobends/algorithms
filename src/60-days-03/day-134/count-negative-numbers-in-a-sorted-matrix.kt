class Solution {
  fun countNegatives(grid: Array<IntArray>): Int {
    var result = 0
    grid.forEach { row ->
      row.forEach {
        if (it < 0) {
          result++
        }
      }
    }
    return result
  }
}