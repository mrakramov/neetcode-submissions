class Solution {
    fun plusOne(digits: IntArray): IntArray {
    val ans = digits
    if(ans.last() != 9){
        ans[ans.lastIndex] = ans[ans.lastIndex]+1
        return ans
    }
    var s = 0
    for(i in digits){
        s=s*10+i
    }
    s+=1
    val newA = IntArray(s.toString().length)
    for(i in newA.size-1 downTo 0 ){
        newA[i] = s%10
        s/=10
    }
    return newA
    }
}
