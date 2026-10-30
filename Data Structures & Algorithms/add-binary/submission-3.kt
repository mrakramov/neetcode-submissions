class Solution {
    fun addBinary(a: String, b: String): String {
        if(a =="0" && b=="0") return "0"
         val sum = convert(a) + convert(b)
        return evaluate(sum)
    }
fun evaluate(n: Long): String {
    var x = n
    var s = ""
    while (x > 0) {
        s = "${x % 2}" + s
        x /= 2
    }
    return s
}

fun convert(x: String): Long {
    var result: Long = 0
    for ((i, j) in (x.length - 1 downTo 0).withIndex()) {
        result += x[i].digitToInt() * Math.pow(2.0,j.toDouble()).toLong()
    }
    return result
}
}
