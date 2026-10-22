class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var ans =intArrayOf()
        for(i in nums.indices){
            for(j in nums.indices){
                if(nums[i]+nums[j]==target && i!=j){
ans = intArrayOf(j,i)
break
                }
            }
        }
        return ans
    }
}
