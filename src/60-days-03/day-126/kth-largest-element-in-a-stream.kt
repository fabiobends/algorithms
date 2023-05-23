class KthLargest(k: Int, nums: IntArray) {

    private val numbers = nums.toMutableList()
    private val kth = k

    fun add(`val`: Int): Int {
      numbers.add(`val`)
      numbers.sort()
      return numbers.elementAt(numbers.size - kth)      
    }

}

// Solution using PriorityQueue
// class KthLargest(val k: Int, val nums: IntArray) {
//     val heap = PriorityQueue<Int>(k)

//     init {
//         nums.forEach {
//             add(it)    
//         }
//     }

//     fun add(v: Int): Int {
//         heap.offer(v)
//         if (heap.size > k) heap.poll()
//         return heap.peek()
//     }
// }