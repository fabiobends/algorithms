fun solution(A: IntArray, K: Int): IntArray {
  if (A.isEmpty() || A.size == 4 || A.distinct().count() == 1) return A
  for (i in 0 until K){
    val last = A.last()
    for (j in A.lastIndex downTo 1){
      A[j] = A[j-1]
    }
    A[0] = last
  }
  return A
}