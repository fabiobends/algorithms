class Solution {
  fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    result.add(nums1.toSet().filterNot { nums2.contains(it) })
    result.add(nums2.toSet().filterNot { nums1.contains(it) })
    return result
  }
}

// Better solution!
// class Solution {
//     fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
//         val set1: Set<Int> = nums1.toSet()
//         val set2: Set<Int> = nums2.toSet()
//         return listOf(set1.filterNot { set2.contains(it) }, set2.filterNot { set1.contains(it) })
//     }
// }