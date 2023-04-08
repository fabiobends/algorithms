fun sumConsecutives(s: List<Int>): List<Int> {
    val result = mutableListOf<Int>(s[0])
    for (i in 1 until s.size){
        if (s[i] == s[i-1]){
            result[result.size - 1] += s[i]
        } else {
            result.add(s[i])
        }
    }
    return result
}

// The same response but shortened
// fun sumConsecutives(s: List<Int>) = mutableListOf(s[0]).apply {
//     (1..s.lastIndex).forEach { if (s[it] == s[it - 1]) this[lastIndex] += s[it] else add(s[it]) }
// }