import 'dart:math';

class Solution {
  int search(List<int> nums, int target) {
    final minPoint = findMin(nums);
    final left = binarySearch(nums, target, 0, minPoint - 1);
    final right = binarySearch(nums, target, minPoint, nums.length - 1);
    return max(left, right);
  }

  int findMin(List<int> nums) {
    var left = 0;
    var right = nums.length - 1;

    if (nums.length == 1) return 0;
    while (left < right) {
      final mid = ((left + right) / 2).floor();
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }

  int binarySearch(List<int> nums, target, left, right) {
    while (left <= right) {
      final mid = ((left + right) / 2).floor();
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
