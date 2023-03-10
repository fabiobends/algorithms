class Solution(head: ListNode?) {

  val head = head

  fun getRandom(): Int {
    var length = 0
    var curr = head
    while (curr != null){
      length++
      curr = curr.next
    }
    curr = head
    var i = 1;
    val chosenNodeNumber = (1..length).random()
    while (i < chosenNodeNumber){
      curr = curr?.next
      i++
    }
    return curr?.`val` ?: 0
  }

}

import kotlin.random.Random

// pretty optimized solution I've found
// class Solution(private val head: ListNode?) {

//   private val random = Random
    
//   fun getRandom(): Int {
//     var node = head   
//     var count = 0
//     var res = 0
//     while (node != null) {
//       count++
//       if (random.nextInt(count) == 0) res = node.`val`
//       node = node.next
//     }
//     return res          
//   }

// }