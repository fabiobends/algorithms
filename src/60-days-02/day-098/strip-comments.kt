fun solution(input: String, markers: CharArray): String {
  val cleanTextList = input.lines().map {
    var index = it.length
    for (marker in markers){
      if(it.contains(marker)){
        index = minOf(index, it.indexOf(marker))
      }
    }
    it.substring(0, index).trim()
  }
  return cleanTextList.joinToString("\n")
}

// pretty beatiful solution below:
// fun solution(input: String, markers: CharArray): String =
//    input.lines().map { line ->
//        line.split(*markers).first().trimEnd()
//    }.joinToString("\n")