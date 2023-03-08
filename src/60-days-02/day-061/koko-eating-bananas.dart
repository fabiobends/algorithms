import 'dart:math';

class Solution {
  int minEatingSpeed(List<int> piles, int h) {
    int low = 1;
    int high = piles.reduce((curr, next) => curr > next ? curr : next);
    while (low < high) {
      int mid = low + ((high - low) / 2).floor();
      if (isValid(mid, piles, h)) {
        high = mid;
        continue;
      }
      low = mid + 1;
    }
    return low;
  }

  bool isValid(int maxpiles, List<int> piles, int h) {
    int hours = 0;
    for (int i in piles) {
      int time = (i / maxpiles).floor();
      hours += time;
      if (i % maxpiles != 0) hours++;
    }
    if (hours <= h) return true;
    return false;
  }
}
