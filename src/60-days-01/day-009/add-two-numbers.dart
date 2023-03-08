
// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode? next;
  ListNode([this.val = 0, this.next]);
}


class Solution {
  ListNode? addTwoNumbers(ListNode? l1, ListNode? l2) {
    var sum = 0;
    ListNode? current = new ListNode(0);
    var result = current;
    while(l1 != null || l2 != null) {
      if (l1 != null){
          sum += l1.val;
          l1 = l1.next;
      }
      if(l2 != null) {
          sum += l2.val;
          l2 = l2.next;
      }
      current?.next = new ListNode(sum % 10);
      current = current?.next;
      sum = sum > 9 ? 1 : 0;
    }
    if(sum == 1) {
        current?.next = new ListNode(sum);
    }
    return result.next;
  }
}