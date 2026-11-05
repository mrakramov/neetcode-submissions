class Solution {
   
fun validPalindrome(s: String): Boolean {
    val reversed = s.reversed()
    if (s == reversed) return true

    for ((index, ch) in s.withIndex()) {
        val nS = s.removeRange(index, index + 1)
        if (nS == nS.reversed()) return true
    }
    return false
}

    
}
