package org.issxjl2015.tx.linkedlist.lc_环形链表;

import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        ListNode head3 = new ListNode(2);
        head.next.next = head3;
        ListNode head4 = new ListNode(7);
        head.next.next.next = head4;
        ListNode head5 = new ListNode(7);
        head.next.next.next = head5;
        head.next.next.next.next = head3;

        boolean ans = solution.hasCycle(head);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        head.next.next = head;

        boolean ans = solution.hasCycle(head);
        Assert.assertTrue(ans);
    }
}
