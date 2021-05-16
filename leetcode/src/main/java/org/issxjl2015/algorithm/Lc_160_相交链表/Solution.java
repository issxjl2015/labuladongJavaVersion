package org.issxjl2015.algorithm.Lc_160_相交链表;

import org.issxjl2015.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode head1 = headA;
        ListNode head2 = headB;
        while (head1 != null) {
            set.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (set.contains(head2)) {
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
}
