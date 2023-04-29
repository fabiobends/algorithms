fun solution(A: IntArray): Int {
  var totalSize: Long = A.size.toLong() + 1
  var totalSum: Long = (1+totalSize) * totalSize / 2
  var currentSum: Long = 0
  for(value in A) {
    currentSum += value
  }
  val result: Long = totalSum - currentSum
  return result.toInt()
}