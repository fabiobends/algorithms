class Solution {
  fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
    val map = hashMapOf<Int, Boolean>()
    val result = hashSetOf<Int>()
    for (edge in edges){
      map[edge[1]] = true
    }
    for (edge in edges){
      if (map[edge[0]] == null) result.add(edge[0])
    }
    return result.toList();
  }
}


// One line solution
// class Solution {
//     fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
//         return (0 until n) - edges.map { it[1] }
//     }
// }