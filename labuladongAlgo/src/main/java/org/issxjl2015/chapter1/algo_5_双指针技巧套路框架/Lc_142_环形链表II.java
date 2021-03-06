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
        // 判断一下结束循环的原因，是找到了环，还是没有环
        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
