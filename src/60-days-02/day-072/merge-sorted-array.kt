class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
      var currentPointer = (m + n) - 1
      var m = m
      var n = n      
      while (m > 0 && n > 0) {
        if (nums1[m-1] > nums2[n-1]) {
          nums1[currentPointer] = nums1[m-1]
          m--
        } else {
          nums1[currentPointer] = nums2[n-1]
          n--
        }
        currentPointer--
      }
      
      while (n > 0) {
        nums1[currentPointer] = nums2[n - 1]
        n--
        currentPointer--
      }
    }
}