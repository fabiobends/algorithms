fun maxSequence(arr: List<Int>): Int {
    var result = 0
    var length = arr.size
    
    while (length > 0) {
        val times = arr.size - length + 1
        for (i in 0 until times){
            var sum = arr.subList(i, i + length).sum()
            if (sum > result){
                result = sum
            }
        }
        length--
    }
    
    return result
}

/* Even better solution O(n)
fun maxSequence(arr: List<Int>): Int {
    // Kadane's algorithm.
    // Finds the maximum sum of a contiguous subsequence in an array or list of integers.

    var sum = 0
    var max = 0
    
    arr.forEach {value ->
        sum = if(value > sum + value) value else sum + value
        max = if(sum > max) sum else max
    }
    
    return max
}
*/
