class Solution {
  List<int> searchRange(List<int> nums, int target) {
    int lastIndex = nums.length - 1;
    int left = 0;
    int right = lastIndex;
    int currentResult = -1;
    List<int> result = [];
    while (left <= right) {
      final int mid = ((left + right) / 2).floor();
      if (nums[mid] == target) {
        currentResult = mid;
        break;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    if (currentResult < 0) {
      return [-1, -1];
    }
    left = currentResult;
    right = currentResult;
    result.add(currentResult);
    result.add(currentResult);
    while (left > 0) {
      left--;
      if (nums[left] == target) {
        result[0] = left;
      } else {
        break;
      }
    }
    while (right < lastIndex) {
      right++;
      if (nums[right] == target) {
        result[1] = right;
      } else {
        break;
      }
    }
    return result;
  }
}
