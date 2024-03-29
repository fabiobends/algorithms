class Solution {
  fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    arr.sort()
    val ratio = arr[1] - arr[0]
    for (i in 2 until arr.size){
      if (arr[i] - arr[i - 1] != ratio) return false
    }
    return true
  }
}