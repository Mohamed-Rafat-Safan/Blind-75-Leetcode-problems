class Solution {
fun countBits(n: Int): IntArray {                             
    val arr = IntArray(n + 1)                                 
    for (i in 0..n) {                                         
        arr[i] = Integer.toBinaryString(i).count { it == '1' }
    }                                                         
    return arr                                                
}                                                             
                                                              
}
