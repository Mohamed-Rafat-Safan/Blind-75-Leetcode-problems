class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val dp = IntArray(nums.size) {1}
        var res = 1
        for(i in 1 until nums.size) {
            for(j in 0 until i) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j]+1, dp[i])
                }
            }
            res = Math.max(res, dp[i])
        }
        return res
    }
}
