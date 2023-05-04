fun solution(X: Int, A: IntArray): Int {
  val set = hashSetOf<Int>()
  for (i in 0 until A.size){
    if (A[i] <= X){
      set.add(A[i])
      if (set.size == X) return i
    }
  }
  return -1
}