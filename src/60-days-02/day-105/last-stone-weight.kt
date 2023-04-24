class Solution {
  fun lastStoneWeight(stones: IntArray): Int {
    stones.sortDescending()
    while (stones.size != 1 && stones[1] != 0){
      stones[0] -= stones[1]
      stones[1] = 0
      stones.sortDescending()
    }
    return stones[0]
  }
}

// best solution using PriorityQueue!
class Solution {
  fun lastStoneWeight(stones: IntArray): Int {
    val heap = PriorityQueue<Int> { a, b -> b.compareTo(a) }
    stones.forEach { heap.add(it) }

    while (heap.size > 1) { 
      heap.add(heap.poll() - heap.poll())
    }

    return heap.poll()
  }
}