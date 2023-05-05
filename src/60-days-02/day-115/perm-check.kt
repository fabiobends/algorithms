fun solution(A: IntArray): Int {
  val collection = hashSetOf<Int>()
  for (number in A){
    if (number <= A.size){
      collection.add(number)
    }
  }
  if (collection.size == A.size) return 1
  return 0
}