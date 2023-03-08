class Solution {
  List<List<int>> threeSum(List<int> nums) {
    nums.sort();
    var result = List<List<int>>.empty(growable: true);
    for (int i = 0; i < nums.length - 2; i++){
      if (i > 0 && nums[i - 1] == nums[i]) continue;
      var left = i + 1;
      var right = nums.length - 1;
      while (left < right) {
        final sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
          result.add([nums[i], nums[left], nums[right]]);
          left++;
          while (nums[left - 1] == nums[left] && left < right) {
            left++;
          }
        } else if (sum > 0) {
          right--;
        } else {
          left++;
        }
      }  
    }
    return result;
  }
}