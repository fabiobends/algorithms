class Solution {
  fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    result.add(nums1.toSet().filterNot { nums2.contains(it) })
    result.add(nums2.toSet().filterNot { nums1.contains(it) })
    return result
  }
}