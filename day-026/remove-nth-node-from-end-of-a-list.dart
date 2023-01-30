/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  ListNode? removeNthFromEnd(ListNode? head, int n) {
    ListNode? first = head;
    ListNode? second = head;

    for (int i = 0; i < n; i++){
      second = second?.next;
    }
    if (second == null) return head?.next;

    while (second?.next != null){
      first = first?.next;
      second = second?.next;
    }

    first?.next = first?.next?.next;
    return head;
  }
}