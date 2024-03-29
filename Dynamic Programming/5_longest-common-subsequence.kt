class Solution {
   fun longestCommonSubsequence(text1: String, text2: String): Int {
    val m = text1.length
    val n = text2.length

    // Create a 2D array to store the lengths of common subsequences
    val dp = Array(m + 1) { IntArray(n + 1) }

    // Iterate through the strings and calculate the lengths of common subsequences
    for (i in 1..m) {
        for (j in 1..n) {
            if (text1[i - 1] == text2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                dp[i][j] = maxOf(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    // Return the length of the longest common subsequence
    return dp[m][n]
}
}
