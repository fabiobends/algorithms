class Solution {
  int removeDuplicates(List<int> nums) {
    int count = 1;
    int value = nums[0];
    for (int i = 1; i < nums.length; i++){
      if (nums[i] > value){
        value = nums[i];
        nums[count] = value;
        count++;
      }
    }
    return count;
  }
}