class Solution {
  bool isPalindrome(int x) {
    if(x < 0) return false;
    final list = x.toString().split("");
    final halfList = (list.length / 2).floor();
    for (int i = 0; i < halfList; i++){
      if(list[i] != list[list.length - 1 - i]){
        return false;
      }
    }
    return true;
  }
}