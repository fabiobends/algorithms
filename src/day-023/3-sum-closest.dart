class Solution {
  int threeSumClosest(List<int> nums, int target) {
    nums.sort();
    int result = nums[0] + nums[1] + nums[2];
    if (nums.length == 3) return result;
    for (int i = 0; i < nums.length - 2; i++){
      if (result == target) break;
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right){
        final sum = nums[i] + nums[left] + nums[right];
        if (sum == target){
          result = target;
          left = 0;
          right = 0;
        } else {
          if (sum < target){
            left++;
          } else {
            right--;
          }
          final resultDifference = (result - target).abs();
          final candidateDifference = (sum - target).abs();
          if (candidateDifference < resultDifference){
            result = sum;
          }
        }
      }
    }
    return result;
  }
}