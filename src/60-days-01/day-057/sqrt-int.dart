class Solution {
  int mySqrt(int x) {
    if (x < 2) return x;
    int first = 1, last = x;
    while (first <= last) {
      int mid = first + ((last - first) / 2).floor();
      if (mid * mid == x)
        return mid;
      else if (mid * mid > x) {
        last = mid - 1;
      } else {
        first = mid + 1;
      }
    }
    return last;
  }
}
