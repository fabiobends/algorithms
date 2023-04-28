fun solution(X: Int, Y: Int, D: Int): Int {
  val rest = (Y - X) % D
  return (Y - X) / D + if (rest > 0) 1 else 0
}