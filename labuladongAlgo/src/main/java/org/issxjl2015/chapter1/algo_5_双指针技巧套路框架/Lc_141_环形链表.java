package org.issxjl2015.chapter1.algo_5_双指针技巧套路框架;

import org.issxjl2015.common.ListNode;

public class Lc_141_环形链表 {

    public boolean hasCycle(ListNode head) {
        ListNode fast, slow;
        // 初始化快、慢指针指向头结点
        fast = slow = head;
        while (fast != null && fast.next != null) {
            // 快指针每次走两步
            fast = fast.next.next;
            // 慢指针每次走一步
            slow = slow.next;
            // 如果存在环，快、慢指针必然相遇
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
