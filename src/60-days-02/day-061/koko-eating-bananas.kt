class Solution {
  fun minEatingSpeed(piles: IntArray, h: Int): Int {    
    var low: Int = 1
    var high: Int = piles.max() ?: 0
    while(low < high){
      val mid = low + (high - low) / 2
      if(isValid(mid, piles, h)){
        high = mid
        continue
      }
      low = mid + 1
    }
    return low
  }
    
  fun isValid(maxPiles: Int, piles: IntArray, h: Int): Boolean {
    var hours: Int = 0
    for(i: Int in piles){
      val time = i / maxPiles
      hours += time
      if(i % maxPiles != 0) hours++
    }
    if (hours <= h) return true
    return false
  }

}