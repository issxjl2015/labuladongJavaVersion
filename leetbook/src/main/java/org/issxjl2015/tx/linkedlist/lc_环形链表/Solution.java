package org.issxjl2015.tx.linkedlist.lc_环形链表;

import org.issxjl2015.common.ListNode;

public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
