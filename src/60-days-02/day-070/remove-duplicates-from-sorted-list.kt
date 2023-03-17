class Solution {
  fun deleteDuplicates(head: ListNode?): ListNode? {
    var temp = head
    while (temp?.next != null) {
      if (temp.next.`val` == temp.`val`){
        temp.next = temp.next.next
        continue
      }
      temp = temp.next
    }
    return head
  }
}