class Solution {
    fun isPalindrome(s: String): Boolean {
    val nS = s.replace(" ", "").lowercase().filter { it.isLetterOrDigit() }
var reversed = ""
for(i in nS.length-1 downTo  0){
reversed += nS[i]
}
return nS == reversed
}
}
