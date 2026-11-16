class Solution {
fun missingNumber(nums: IntArray): Int {
    val fullN = 0.rangeTo(nums.size).toList()
    var i = 0
    while (nums.contains(fullN[i])) {
        i++
    }
    return fullN[i]
}

}
