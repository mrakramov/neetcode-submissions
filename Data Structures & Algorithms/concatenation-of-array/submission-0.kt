class Solution {
fun getConcatenation(nums: IntArray): IntArray {
    val n = nums.size
    val ans = IntArray(n * 2)
    var i = 0
    for (index in ans.indices) {
        if (index > nums.lastIndex) {
            ans[index] = nums[i]
            i++
        } else {
            ans[index] = nums[index]
        }
    }
    return ans
}
}
