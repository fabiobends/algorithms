class Solution {
  double findMedianSortedArrays(List<int> nums1, List<int> nums2) {
    final list = nums1 + nums2;
    list.sort();
    int half = (list.length/2).floor();
    double median = list.length % 2 == 0 ? (list[half - 1] + list[half])/2 : list[half].toDouble();
    return median;
  }
}