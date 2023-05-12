fun solution(A: IntArray): Int {
    A.sort()
    var min = 1
    for (number in A){
       if (min == number) min++
       else if (number > min) break
    }
    return min
}