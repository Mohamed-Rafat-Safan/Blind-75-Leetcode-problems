class Solution {
fun missingNumber(nums: IntArray): Int {
    for(i in 0..nums.size){
        if(!nums.contains(i)){
            return i
        }
    }
    return 0
}
}
