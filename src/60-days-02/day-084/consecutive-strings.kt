package longestconsec

fun longestConsec(strarr:Array<String>, k:Int):String {
    val n = strarr.size
    var result = ""
    if (n == 0 || k > n || k <= 0) return result
    var index = 0
    while (index <= strarr.size - k){
        var localResult = ""
        for (i in 0 until k){
            localResult += strarr[index+i]
        }
        if (localResult.length > result.length){
            result = localResult
        }
        index++
    }
    return result
}