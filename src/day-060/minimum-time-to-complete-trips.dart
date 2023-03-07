class Solution {
  int minimumTime(List<int> time, int totalTrips) {
    int low = time.reduce((curr, next) => curr > next ? next : curr);
    int high = totalTrips * low;
    while (low < high) {
      int mid = low + ((high - low) / 2).floor();
      if (blackbox(mid, totalTrips, time)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  bool blackbox(int validTime, int totalTrips, List<int> time) {
    int trips = 0;
    for (int it in time) {
      trips += (validTime / it).floor();
    }
    if (trips >= totalTrips) return true;
    return false;
  }
}
