fun solution(A: IntArray): Int {
  var secondSum = A.sum()
  var firstSum = 0
  var min = Int.MAX_VALUE
  for (i in 0 until A.lastIndex){
    firstSum += A[i]
    secondSum -= A[i]
    val candidate = Math.abs(firstSum - secondSum)
    if (candidate < min){
      min = candidate
    }
  }
  return min
}