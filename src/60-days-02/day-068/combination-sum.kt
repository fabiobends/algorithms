class Solution {
  fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val res = ArrayList<List<Int>>()
    val path = arrayListOf<Int>()
    
    fun dfs(start: Int, sum: Int) {
      if (sum == target) {
        res.add(path.toList())
        return
      }
      for (i in start..candidates.size - 1) {
        if (sum + candidates[i] > target) continue
        path.add(candidates[i])
        dfs(i, sum + candidates[i])
        path.removeAt(path.size - 1)
      }
    }
    
    dfs(0, 0)
    return res
  }
}