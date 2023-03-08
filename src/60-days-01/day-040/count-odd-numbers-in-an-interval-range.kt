class Solution {
  fun countOdds(low: Int, high: Int): Int {
    var left = low
    if (left % 2 == 0){
      left++;
    }
    if (left > high) return 0
    return (high - left) / 2 + 1 
  }
}