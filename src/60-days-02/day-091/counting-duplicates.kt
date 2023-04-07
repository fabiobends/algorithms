fun duplicateCount(text: String): Int {
    val map = hashMapOf<Char, Int>()
    text.forEach {
        val char = it.lowercaseChar()
        val previousValue = map[char] ?: 0                
        map[char] = previousValue + 1
    }
    return map.count { it.value >= 2 }
}

// Amazing solution seen on Codewars
// fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }