class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
val ars = nums.toSet()
return nums.size != ars.size
    }
}
