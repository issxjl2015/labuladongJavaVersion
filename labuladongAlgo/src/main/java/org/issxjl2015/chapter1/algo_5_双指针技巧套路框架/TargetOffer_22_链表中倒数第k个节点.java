package org.issxjl2015.chapter1.algo_5_双指针技巧套路框架;

import org.issxjl2015.common.ListNode;

public class TargetOffer_22_链表中倒数第k个节点 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast, slow;
        fast = slow = head;
        while (k-- > 0) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
