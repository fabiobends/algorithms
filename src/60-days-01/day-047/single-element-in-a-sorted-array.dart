class Solution {
  int singleNonDuplicate(List<int> nums) {
    if (nums.length == 1) return nums.first;
    int lastIndex = nums.length - 1;
    int number = 0;
    for (int i = 0; i <= lastIndex / 2; i += 2) {
      if (nums[i] != nums[i + 1]) {
        number = nums[i];
        break;
      }
      if (nums[lastIndex - i] != nums[lastIndex - i - 1]) {
        number = nums[lastIndex - i];
        break;
      }
    }
    return number;
  }
}
