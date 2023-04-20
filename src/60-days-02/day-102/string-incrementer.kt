fun incrementString(str: String) : String {
    val number = str.takeLastWhile { it.isDigit() }
    return str.dropLast(number.length) + ((number.toIntOrNull() ?: 0) + 1).toString().padStart(number.length, '0')
}