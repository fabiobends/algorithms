 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  ListNode? reverseKGroup(ListNode? head, int k) {
    if(head == null || k == 1) return head;
    ListNode dummy = ListNode();
    dummy.next = head;

    ListNode? curr = dummy, nex = dummy, pre = dummy;

    int count = 0;

    while(curr?.next != null){
      curr = curr?.next;
      count++;
    }

    while(count >= k){ 
      curr = pre?.next;
      nex = curr?.next;
      for(int i = 1;i < k;i++){
        curr?.next = nex?.next;
        nex?.next = pre?.next;
        pre?.next = nex;
        nex = curr?.next;
      }
      pre = curr;
      count -= k;
    }
    return dummy.next;
  }
}