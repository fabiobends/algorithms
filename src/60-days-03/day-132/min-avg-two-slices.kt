fun solution(A: IntArray): Int {
    var minAvg = (A[0] + A[1]).toDouble() / 2
    var minIndex = 0
    for (i in 2 until A.size) {
        var avg = (A[i - 2] + A[i - 1] + A[i]).toDouble() / 3;
        if (avg < minAvg) {
            minAvg = avg
            minIndex = i - 2
        }

        avg = (A[i - 1] + A[i]).toDouble() / 2;
        if (avg < minAvg) {
            minAvg = avg
            minIndex = i - 1
        }
    }
    return minIndex
}