import 'dart:collection';
import 'dart:math' as math;

class Solution {
  int lengthOfLongestSubstring(String s) {      
    int n = s.length;
    int ans = 0;
    Map<String, int> map = HashMap();
    for (int j = 0, i = 0; j < n; j++) {
      if (map.containsKey(s[j])) {
        int? temp = map[s[j]];
        if (temp != null){
          i = math.max(temp, i);
        }
      }
      ans = math.max(ans, j - i + 1);
      map.addAll({s[j]: j + 1});
    }
    return ans;
  }
}