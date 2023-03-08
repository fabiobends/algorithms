class ListNode {
  int val;
  ListNode? next;
  ListNode([this.val = 0, this.next]);
}

class Solution {
  ListNode? mergeKLists(List<ListNode?> lists) {
    int amount = lists.length;
    int interval = 1;
    while (interval < amount) {
      for (int i = 0; i < amount - interval; i += interval * 2) {
        lists[i] = merge2Lists(lists[i], lists[i + interval]);
      }
      interval *= 2;
    }
    return amount > 0 ? lists[0] : null;
  }

  ListNode? merge2Lists(ListNode? l1, ListNode? l2) {
    final head = ListNode(0);
    ListNode? point = head;
    while (l1 != null && l2 != null) {
      var firstValue = l1.val;
      var secondValue = l2.val;
      if (firstValue <= secondValue) {
        point?.next = l1;
        l1 = l1.next;
      } else {
        point?.next = l2;
        l2 = l1;
        l1 = point?.next?.next;
      }
      point = point?.next;
    }

    if (l2 != null) {
      point?.next = l2;
    } else {
      point?.next = l1;
    }
    return head.next;
  }
}
