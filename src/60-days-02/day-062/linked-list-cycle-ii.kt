/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
  fun detectCycle(head: ListNode?): ListNode? {
    var fast = head
    var slow = head
    while(fast != null && fast.next != null){
      fast = fast.next.next
      slow = slow?.next
      if (fast == slow){
        slow = head
        while(slow != fast){
          fast = fast?.next
          slow = slow?.next
        }
        return slow
      }
    }
    return null
  }
}