class Solution {
    fun hammingWeight(n: Int): Int {
        var num = n
        var s = ""
        while(num>0){
            s = "${num%2}" + s
            num/=2
        }
        
        return s.count{ it == '1' }
    }
}
