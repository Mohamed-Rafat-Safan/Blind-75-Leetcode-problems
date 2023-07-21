/// this code is Accepted
class Solution {
 fun threeSum(nums: IntArray): List<List<Int>> {
    val ans = mutableSetOf<List<Int>>()
    nums.sort()

    var sum = -1
    for (i in 0 until nums.size - 2) {            
        var left = i + 1
            var right = nums.size-1
            while (left < right){

                val sum = nums[i] + nums[left] + nums[right]

                if (sum == 0){
                    ans.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--
                }

                else if (sum < 0) left++

                else right--
            }
    }

    return ans.toList()
}
}





// this code is Time Limit Exceeded
fun threeSum(nums: IntArray): List<List<Int>> {
    val ans = mutableSetOf<List<Int>>()
    nums.sort()

    var sum = -1
    for (i in 0 until nums.size - 2) {            // 1 2 3
        for (j in i + 1 until nums.size - 1) {
            for (k in j + 1 until nums.size) {
                sum = nums[i] + nums[j] + nums[k]

                if (sum == 0) {
                    ans.add(listOf(nums[i], nums[j], nums[k]))
                    sum = -1
                }
            }
        }
    }

    return ans.toList()
}
