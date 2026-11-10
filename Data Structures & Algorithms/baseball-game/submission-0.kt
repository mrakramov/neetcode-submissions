class Solution {
fun convertInt(o: String): Boolean {
    return try {
        o.toInt()
        true
    } catch (_: NumberFormatException) {
        false
    }
}


fun calPoints(operations: Array<String>): Int {
    val scores = mutableListOf<Int>()
    operations.forEach { o ->
        when {
            convertInt(o) -> scores.add(o.toInt())
            o == "+" -> {
                scores.add(scores.takeLast(2).sum())
            }
            o == "D" -> scores.add(scores.last() * 2)
            o == "C" -> scores.removeLast()
        }
    }
    
    return scores.sum()
}
}
