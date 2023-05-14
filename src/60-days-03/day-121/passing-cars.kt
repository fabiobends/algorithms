fun solution(A: IntArray): Int {
  var zeroesCount = 0
  var pairs = 0

  for (value in A) {
    if(value == 0) {
      zeroesCount++
    } else {
      pairs += zeroesCount
    }
    if (pairs > 1000000000 ) return -1
  }

  return pairs;
}