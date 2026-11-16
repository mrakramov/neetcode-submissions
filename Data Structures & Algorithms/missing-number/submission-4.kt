class Solution {
fun missingNumber(nums: IntArray): Int {
    var i = 0
    while (nums.contains(i)) {
        i++
    }
    return i
}
}
