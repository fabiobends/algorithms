package weight

fun orderWeight(string:String): String =
    string.split(" ").sorted().sortedBy { it.map { it.toString().toInt() }.sum() }.joinToString(" ")