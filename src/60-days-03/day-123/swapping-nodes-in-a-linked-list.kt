class Solution {
  fun swapNodes(head: ListNode?, k: Int): ListNode? {
    if (head == null) return null
    var left = head
    var right = head
    for (i in 1 until k) {
      left = left?.next
    }
    var curr = left
    while (curr?.next != null) {
      curr = curr.next
      right = right?.next
    }
    val temp = left?.`val`
    left?.`val` = right?.`val`
    right?.`val` = temp
    return head
  }
}