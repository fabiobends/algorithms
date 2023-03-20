class Solution {
  fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var places = 0
    var i = 0
    val lastIndex = flowerbed.size - 1

    if (flowerbed.size == 1 && flowerbed[0] == 0) return n <= 1
    
    while (i <= lastIndex){
      if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0){
        places++
        i += 2
      } else if (
        i == lastIndex 
        && flowerbed[lastIndex] == 0 
        && flowerbed[lastIndex - 1] == 0){
        places++
        break;
      } else if (flowerbed[i] == 1) {
        i += 2
      } else {
        if (i > 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
          places++
          i += 2
        } else {
          i++
        }
      }
    }
    return n <= places
  }
}