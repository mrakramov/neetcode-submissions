class Solution {
fun isHappy(n: Int): Boolean {
    var x = n
    var sum = 0
    var temp = true
    val list = mutableListOf<Int>()
    var result = false
    while (temp) {
        while (x > 0) {
            sum += (x % 10) * (x % 10)
            x /= 10
        }
        println(sum)
        when {
            sum == 1 -> {
                temp = false
                result = true
            }
            (sum in list) -> {
                temp = false
                result = false
            }
            else -> {
                list.add(sum)
                x = sum
                sum = 0
            }
        }
    }
    return result
}
}
