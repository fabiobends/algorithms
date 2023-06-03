fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
    val numOfA = IntArray(S.length + 1)
    val numOfC = IntArray(S.length + 1)
    val numOfG = IntArray(S.length + 1)

    for (i in 0 until S.length){
      numOfA[i + 1] = numOfA[i] if (S[i] == 'A') 1 else 0
      numOfC[i + 1] = numOfC[i] if (S[i] == 'C') 1 else 0
      numOfG[i + 1] = numOfG[i] if (S[i] == 'G') 1 else 0
    }

    val result = IntArray(P.size)

    for (j in 0 until P.size){
      val firstIndex = P[j]
      val lastIndex = Q[j] + 1
      if (numOfA[lastIndex] - numOfA[firstIndex] > 0) result[j] = 1
      else if (numOfC[lastIndex] - numOfC[firstIndex] > 0) result[j] = 2
      else if (numOfG[lastIndex] - numOfG[firstIndex] > 0) result[j] = 3
      else result[j] = 4
    }

    return result
}