package org.issxjl2015.algorithm.Lc_21_合并两个有序链表;

import org.issxjl2015.common.ListNode;

public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 哨兵节点 preHead
        ListNode preHead = new ListNode(-1);

        ListNode prev = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return preHead.next;
    }
}
