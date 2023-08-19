class Solution {
fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val tf = Array<Boolean>(s.length + 1) { false }
    println(tf)
    tf[0] = true
    
    for (i in 0..s.length) {
        for (j in 0 until i) {
            if (tf[j] == true) {
                if (wordDict.contains(s.substring(j until i))) {
                    tf[i] = true
                    break
                }
            }
        }
    }
    
    return tf[s.length]
}
}
