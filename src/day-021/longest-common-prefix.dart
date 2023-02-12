class Solution {
  String longestCommonPrefix(List<String> strs) {
    int i = -1;
    bool hasCommonPrefix = true;
    if (strs.length == 1) return strs[0];
    while (hasCommonPrefix){
      i++;
      for (int j = 1; j < strs.length; j++){
        if (i > strs[j].length - 1 || i > strs[j-1].length - 1){
          hasCommonPrefix = false;
          break;
        }
        if (strs[j].length == 0 || strs[j][i] != strs[j-1][i]){
          hasCommonPrefix = false;
          break;
        }
      }
    }
    if (i > 0){
      return strs[0].substring(0, i);
    }
    return '';
  }
}