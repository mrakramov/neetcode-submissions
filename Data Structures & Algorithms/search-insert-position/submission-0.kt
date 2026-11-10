class Solution {
   fun searchInsert(nums: IntArray, target: Int): Int {
    val mutable = nums.toMutableList()
    mutable.add(target)
    mutable.sort()
    return mutable.indexOf(target)
}
}
