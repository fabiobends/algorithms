package solution

object PhoneDir {

    fun phone(strng: String, num: String): String {
        val matchList = strng.lines().filter { Regex("\\+"+num).containsMatchIn(it) }
        when(matchList.count()) {
            0 -> return """Error => Not found: $num"""
            1 -> {
                    val s = matchList.first()
                    val name = Regex("<[^>]+>").find(s)!!.value.trim('<','>')
                    val address = s.replace(Regex("""($name|$num|[^a-zA-Z0-9.-])"""), " ").split(' ').filterNot { it.isBlank() }.joinToString(" ")
                    return """Phone => $num, Name => $name, Address => $address"""
                }
            else -> return """Error => Too many people: $num"""
        }
    }
}