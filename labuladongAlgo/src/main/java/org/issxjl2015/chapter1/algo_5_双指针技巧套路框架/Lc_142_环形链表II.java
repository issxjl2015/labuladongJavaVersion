package org.issxjl2015.chapter1.algo_5_双指针技巧套路框架;

import org.issxjl2015.common.ListNode;

public class Lc_142_环形链表II {

    public ListNode detectCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
