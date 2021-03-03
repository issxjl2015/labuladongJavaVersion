package org.issxjl2015.chapter1.algo_5_双指针技巧套路框架;

import org.issxjl2015.common.ListNode;

public class Lc_876_链表的中间结点 {

    public ListNode middleNode(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // slow就在中间位置
        return slow;
    }
}
