class Solution {
  List<List<int>> fourSum(List<int> nums, int target) {
    nums.sort();
    final result = List<List<int>>.empty(growable: true);
    for (int first = 0; first < nums.length - 3; first++){
      if (first > 0 && nums[first] == nums[first-1]) continue;
      for (int second = first + 1; second < nums.length - 2; second++){
        if ((second - 1) > first && nums[second] == nums[second-1]) continue;
        int third = second + 1;
        int fourth = nums.length - 1;
        while (third < fourth){
          final sum = nums[first] + nums[second] + nums[third] + nums[fourth];
          if (sum == target){
            final quadruplet = <int>[nums[first], nums[second], nums[third], nums[fourth]];
            result.add(quadruplet);
            third++;
            while (third < fourth && nums[third] == nums[third - 1]){
              third++;
            }
          } else if (sum < target){
            third++;
          } else {
            fourth--;
          }
        }
      }
    }
    return result;
  }
}