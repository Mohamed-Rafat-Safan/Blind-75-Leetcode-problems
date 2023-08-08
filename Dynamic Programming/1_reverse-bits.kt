class Solution {
    // you need treat n as an unsigned value
fun reverseBits(n: Int): Int {
    var result = 0
    for (i in 0 until 32) {
        result = result.shl(1) or ((n.shr(i)) and 1)
    }
    return result
}
}
