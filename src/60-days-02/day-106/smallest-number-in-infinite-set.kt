class SmallestInfiniteSet() {
  val queue = PriorityQueue<Int>()
  
  init {
    for (num in 1..1000) {
      queue.add(num)
    }
  }

  fun popSmallest(): Int? {
    return queue.poll()
  }

  fun addBack(num: Int) {
    if (!queue.contains(num)){
      queue.add(num)
    }
  }
}