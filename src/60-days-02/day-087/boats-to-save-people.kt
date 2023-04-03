class Solution {
  fun numRescueBoats(people: IntArray, limit: Int): Int {
    people.sort()

    var counter = 0
    var left = 0
    var right = people.size - 1
        
    while(left <= right){
      val capacity = people[left] + people[right]
      if(capacity <= limit) left++
      counter++
      right--
    }

    return counter
  }
}