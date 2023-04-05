fun findMissingLetter(array: CharArray): Char {
    var result = ' '
    for (i in 0 until array.size - 1){
        if (array[i+1] != array[i].inc()) {
          result = array[i].inc()
          break
        }
    }
    return result
}

