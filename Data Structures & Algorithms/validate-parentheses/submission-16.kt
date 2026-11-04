class Solution {

fun isValid(s: String): Boolean {
    return when (s.first()) {
        '}', ']', ')' -> false
        '(' -> {
            if (!s.contains(')')) return false
            val bracket = checkCloseBracket(0, s, ')')
            if (bracket == "-1") return false
            if (bracket == "") return true
            isValid(bracket)
        }

        '{' -> {
            if (!s.contains('}')) return false
            val bracket = checkCloseBracket(0, s, '}')
            if (bracket == "-1") return false
            if (bracket == "") return true
            isValid(bracket)
        }

        '[' -> {
            if (!s.contains(']')) return false
            val bracket = checkCloseBracket(0, s, ']')
            if (bracket == "-1") return false
            if (bracket == "") return true
            isValid(bracket)
        }

        else -> true
    }

}

fun checkCloseBracket(i: Int, s: String, searched: Char): String {
    val n = s.indexOf(searched)
    return if (n > -1 && ((n - i) == 1 || (n - i) > 2 || s[i] == s[i + 1])) {
        var s1 = s
        val indexes = listOf(i, n).distinct().sortedDescending()
        for (index in indexes) {
            if (index in s1.indices) {
                s1 = s1.removeRange(index, index + 1)
            }
        }
        s1
    } else "-1"
}
}

