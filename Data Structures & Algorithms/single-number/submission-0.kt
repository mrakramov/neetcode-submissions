class Solution {
    fun singleNumber(nums: IntArray): Int {
        val seen = HashSet<Int>()
        for (num in nums) {
            if (num in seen) {
                seen.remove(num)
            } else {
                seen.add(num)
            }
        }
        return seen.first()
    }
}