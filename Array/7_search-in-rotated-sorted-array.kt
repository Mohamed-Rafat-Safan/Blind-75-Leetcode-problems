class Solution {
    fun search(nums: IntArray, target: Int): Int {
    if (!nums.contains(target)) {
        return -1
    }

    return nums.indexOf(target)
}
}
