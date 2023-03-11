class Solution {
  fun sortedListToBST(head: ListNode?): TreeNode? {
    if(head == null) return null
    if(head.next == null) return TreeNode(head.`val`)
    var slow = head
    var fast = head.next.next
    while(fast != null && fast.next != null){
      slow = slow?.next;
      fast = fast.next.next;
    }
    val res = TreeNode(slow!!.next!!.`val`);
    val righthalf = slow?.next?.next;
    slow?.next = null;
    res.left = sortedListToBST(head);
    res.right = sortedListToBST(righthalf);
    return res;
  }
}