package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_5_双指针技巧套路框架.Lc_141_环形链表;
import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Lc_141_环形链表_test {

    @Test
    public void test1() {
        Lc_141_环形链表 solution = new Lc_141_环形链表();
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
        Lc_141_环形链表 solution = new Lc_141_环形链表();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        head.next.next = head;

        boolean ans = solution.hasCycle(head);
        Assert.assertTrue(ans);
    }
}
