fun numberOfPairs(gloves:List<String>) : Int {
    val sortedGloves = gloves.sorted()
    var i = 1
    var pairs = 0
    while (i < gloves.size){
        if (sortedGloves[i] == sortedGloves[i-1]){
            pairs++
            i += 2
        } else {
            i++
        }
    }
    return pairs
}

// Solution using best practices
// fun numberOfPairs(gloves: List<String>): Int {
//     return gloves.groupingBy{ it }.eachCount().values.sumOf{ it / 2 }
// }