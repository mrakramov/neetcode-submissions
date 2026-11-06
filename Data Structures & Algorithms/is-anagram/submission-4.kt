class Solution {
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val sMap = mutableMapOf<Char, Int>()
    val tMap = mutableMapOf<Char, Int>()

    s.forEach { ch ->
        if (ch in sMap.keys) sMap[ch] = sMap[ch]?.plus(1) ?: 0
        else sMap[ch] = 1
    }
    t.forEach { ch ->
        if (ch in tMap.keys) tMap[ch] = tMap[ch]?.plus(1) ?: 0
        else tMap[ch] = 1
    }
    if (sMap.keys != tMap.keys) return false

    var temp = false

    sMap.forEach { (ch, i) ->
        if (tMap[ch] == i) temp = true
        else {
            return false
        }
    }

    return temp
}
}
