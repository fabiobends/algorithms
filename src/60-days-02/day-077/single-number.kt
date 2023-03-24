class Solution {
    fun singleNumber(nums: IntArray): Int {
      nums.sort()
      if (nums.size > 1){
        for (i in 0..nums.size - 2 step 2){
          if (nums[i] != nums[i+1]) return nums[i]
        }
      }
      return nums.last()    
    }
}