class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in nums.indices) {
            val sub = target - nums[i]
            if (nums.contains(sub) && nums.indexOf(sub)!=i) {
                val index = nums.indexOf(sub)
                result[0] = i
                result[1] = index
                break
            }
        
        }

        return result
    }
}
