class Solution {
fun maxProduct(nums: IntArray): Int {      //  1  2  3  4
    if (nums.isEmpty()) return 0

    var maxProduct = nums[0]   // 1
    var minProduct = nums[0]   // 1
    var result = nums[0]      //  1

    for (i in 1 until nums.size) {    //  2  3 -2  4
        if (nums[i] < 0) {
            maxProduct = minProduct.also { minProduct = maxProduct }
        }

        maxProduct = maxOf(nums[i], maxProduct * nums[i])
        minProduct = minOf(nums[i], minProduct * nums[i])

        result = maxOf(result, maxProduct)
    }

    return result
}
}
