/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  ListNode? swapPairs(ListNode? head) {
    ListNode? pointer = head;
    final result = <int>[];
    while (pointer != null){
      result.add(pointer?.val ?? 0);
      pointer = pointer?.next;
    }
    int length = result.length;
    ListNode? temp = null;
    ListNode? dummy = ListNode(0);
    dummy?.next = head;
    ListNode? prev = dummy;
    ListNode? curr = head;
    for (int i = 0; i < (length / 2).floor(); i++){
      temp = curr?.next;
      curr?.next = temp?.next;
      temp?.next = prev?.next;
      prev?.next = temp;
      prev = curr;
      curr = curr?.next;
    }
    return dummy?.next;
  }
}