class Solution {
  int findKthPositive(List<int> arr, int k) {
    Map<int, bool> dict = {};
    for (int i = 0; i < arr.length; i++) {
      dict[arr[i]] = true;
    }
    int resultIndex = 1;
    int result = 1;
    for (int j = 1; j <= arr.length + k; j++) {
      if (dict.containsKey(j)) continue;
      if (resultIndex == k) {
        result = j;
        break;
      }
      resultIndex++;
    }
    return result;
  }
}
