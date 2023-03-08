class ListNode {
  int val;
  ListNode? next;
  ListNode([this.val = 0, this.next]);
}

class Solution {
  ListNode? mergeTwoLists(ListNode? list1, ListNode? list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    ListNode head = ListNode();
    ListNode? pointer = head;
    while (list1 != null && list2 != null) {
      var firstValue = list1.val;
      var secondValue = list2.val;
      if (firstValue > secondValue) {
        pointer?.next = list2;
        list2 = list2.next;
      } else {
        pointer?.next = list1;
        list1 = list1.next;
      }
      pointer = pointer?.next;
    }
    if (list1 == null) {
      pointer?.next = list2;
    } else {
      pointer?.next = list1;
    }
    return head.next;
  }
}
