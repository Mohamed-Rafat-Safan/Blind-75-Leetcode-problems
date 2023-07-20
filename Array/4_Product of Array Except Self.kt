class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        
        val result = IntArray(nums.size)
        var n = 1
        for(i in 0..nums.size - 1)
        {
            result[i] = n
            n *= nums[i]
        }
        n=1
        for(i in nums.size - 1 downTo 0)
        {
            result[i] = n * result[i]
            n *= nums[i]
        }

        return result
    }
}
