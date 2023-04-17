class Solution {
  fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val result = BooleanArray(candies.size)
    candies.forEachIndexed { i, num -> 
      if (num + extraCandies >= candies.max()!!){
        result[i] = true
      }
    }
    return result
  }
}