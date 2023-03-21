class Solution {
    fun zeroFilledSubarray(nums: IntArray): Long {
      var totalSubarrays: Long = 0
      var currentSubarrays = 0
              
      for (num in nums){
        if (num == 0){
          currentSubarrays += 1
          totalSubarrays += currentSubarrays
        } else {
          currentSubarrays = 0
        }
      }
              
      return totalSubarrays
    }
}