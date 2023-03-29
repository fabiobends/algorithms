class Solution {
    fun maxSatisfaction(satisfaction: IntArray): Int {
      satisfaction.sort()
      var max = 0
      var index = 0
      while (index < satisfaction.size){
        var localMax = 0
        var time = 1
        for (i in index until satisfaction.size){
          localMax += satisfaction[i]*time
          time++
        }
        if (localMax > 0 && localMax < max) break
        max = maxOf(max, localMax)
        index++
      }
      return max
    }
}