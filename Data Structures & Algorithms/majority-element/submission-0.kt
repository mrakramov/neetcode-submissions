class Solution {
fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    nums.forEach { n ->
        if (n !in map.keys) {
            var count = 0
            nums.forEach { m ->
                if (n == m) {
                    count++
                }
            }
            map[n] = count
        }
    }

    return map.keys.find { it -> map[it] == map.maxOf { it.value } }?:0
}
}
