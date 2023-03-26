fun rowSumOddNumbers(n: Int): Int {
    // your code here
    var col = 1
    var value = 1
    var result = 0
    while (col <= n){
        for (num in 0 until col){
            if (col == n){
                result += value   
            }
            value += 2
        }
        col++
    }
    return result

    // return n*n*n
}
