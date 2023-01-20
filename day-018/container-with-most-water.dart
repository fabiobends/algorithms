import 'dart:math' as math;

class Solution {
  int maxArea(List<int> height) {
    int left = 0;
    int right = height.length - 1;
    int max = 0;
    while(left < right){
      int w = right - left;
      int h = math.min(height[left], height[right]);
      int area = h * w;
      max = math.max(max, area);
      if(height[left] < height[right]) left++;
      else if(height[left] > height[right]) right--;
      else {
        left++;
        right--;
      }
    }
    return max;
  }
}