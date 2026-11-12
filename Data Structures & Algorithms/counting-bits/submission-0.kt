class Solution {

fun countBits(n: Int): IntArray {
    val ans = IntArray(n + 1)
    for (i in ans.indices) {
        ans[i] = compute(i)
    }
    return ans
}

fun compute(i: Int): Int {
    var n = i
    var count = 0
    while (n > 0) {
        if (n % 2 == 1) count++
        n /= 2
    }
    return count
}

}
