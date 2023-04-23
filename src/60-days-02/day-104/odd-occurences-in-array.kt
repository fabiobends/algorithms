// worst solution, can't succed the last two tests
// event though is O(n)
fun solution(A: IntArray): Int {
    return A.groupBy { it }.values.find { it.size.mod(2) == 1 }!![0]
}

// good solution, but can't succed the last test
fun solution(A: IntArray): Int {
    A.sort()
    for (i in 0 until A.size step 2){
        if (i+1 == A.size) return A[i]
        if (A[i] != A[i+1]) return A[i]
    }  
    return -1
}

// best solution, using `xor` operator
fun solution(A: IntArray): Int {
    var result = 0
    A.forEach {
      result = result xor it
    }
    return result
}