class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
      val rowSize = grid.size
      val colSize = grid[0].size
      for (i in 0 until rowSize){
        for (j in 0 until colSize){
          if (i == 0 && j == 0){
            continue
          } else if (j == 0 && i != 0){
            grid[i][j] += grid[i-1][j]
          } else if (i == 0 && j != 0){
            grid[i][j] += grid[i][j-1]
          } else {
            grid[i][j] += minOf(grid[i-1][j],grid[i][j-1])
          }
        }
      }
      return grid[rowSize-1][colSize-1]
    }
}