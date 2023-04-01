class Solution {
  fun search(nums: IntArray, target: Int): Int {
    var startIndex = 0
    var endIndex = nums.size - 1
    while (startIndex <= endIndex){
      val mid = (startIndex + endIndex) / 2
      if (nums[mid] == target) return mid
      else if (nums[mid] > target) {
        endIndex = mid - 1
      } else {
        startIndex = mid + 1
      }
    }
    return -1    
  }
}